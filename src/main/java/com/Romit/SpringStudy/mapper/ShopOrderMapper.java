package com.Romit.SpringStudy.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.Romit.SpringStudy.entity.ShopOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 李锐(Romit.Lee)
 * @date 2019/12/1 1:48
 */
@Mapper
public interface ShopOrderMapper extends BaseMapper<ShopOrder> {
    int insertList(@Param("list")List<ShopOrder> list);


}