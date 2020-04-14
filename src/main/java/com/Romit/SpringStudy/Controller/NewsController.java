package com.Romit.SpringStudy.Controller;

import com.Romit.SpringStudy.Common.R;
import com.Romit.SpringStudy.Service.NewsListService;
import com.Romit.SpringStudy.entity.NewsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 此文件由 IntelliJ IDEA. 2019.3版本创建
 * \* 创建人: 李锐(Romit.Lee)
 * \* 创建日期: 2020/4/13
 * \* 创建时间: 18:34
 * \* 描述:
 * \
 */
@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    NewsListService newsListService;

    @ResponseBody
    @RequestMapping("/list")
    public R newslist(){
        List<NewsList> list=newsListService.list();
        Map<String,List> map=new HashMap<>();
        map.put("list",list);
        return R.ok(map);

    }
}
