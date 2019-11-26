package com.Romit.SpringStudy.mapper;

import com.Romit.SpringStudy.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface PersonMapper {

    public Person getPerson(Integer id);


}

