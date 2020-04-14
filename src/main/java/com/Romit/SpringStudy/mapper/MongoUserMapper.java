package com.Romit.SpringStudy.mapper;

import com.Romit.SpringStudy.entity.MongoUser;
import com.mongodb.client.result.UpdateResult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

/**
 * 此文件由 IntelliJ IDEA. 2019.3版本创建
 * \* 创建人: 李锐(Romit.Lee)
 * \* 创建日期: 2020/3/23
 * \* 创建时间: 16:04
 * \* 描述:
 * \
 */
@Component
public class MongoUserMapper {
    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 创建对象
     * @param user
     */

    public void saveUser(MongoUser user) {
        mongoTemplate.insert(user);
    }

    /**
     * 根据用户名查询对象
     * @param userName
     * @return
     */

    public MongoUser findUserByUserName(String userName) {
        Query query=new Query(Criteria.where("userName").is(userName));
        MongoUser user =  mongoTemplate.findOne(query , MongoUser.class);
        return user;
    }

    /**
     * 更新对象
     * @param user
     */

    public long updateUser(MongoUser user) {
        Query query=new Query(Criteria.where("id").is(user.getId()));
        Update update= new Update().set("userName", user.getUserName()).set("passWord", user.getPassWord());
        //更新查询返回结果集的第一条
        UpdateResult result =mongoTemplate.updateFirst(query,update,MongoUser.class);
        //更新查询返回结果集的所有
        // mongoTemplate.updateMulti(query,update,UserEntity.class);
        if(result!=null)
        {
            return result.getMatchedCount();

        }

        else
        {
            return 0;

        }

    }

    /**
     * 删除对象
     * @param id
     */

    public void deleteUserById(Long id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query,MongoUser.class);
    }
}
