package com.Romit.SpringStudy.Service;

import com.Romit.SpringStudy.mapper.PersonMapper;
import com.Romit.SpringStudy.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService{

//    @Autowired
//    PersonMapper personMapper =null;



    public Person getPerson(Integer id) {
//        System.out.println("PersonServiceImpl执行中");
//        return personMapper.getPerson(id);
        Person person=new Person();
        return person;
    }




}
