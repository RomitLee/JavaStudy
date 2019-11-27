package com.Romit.SpringStudy.entity;
import cn.hutool.core.clone.CloneRuntimeException;
import cn.hutool.core.clone.Cloneable;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.ClassUtil;


public class Person implements Cloneable<Person>{
    private Integer id=null;
    private  String name=null;

    private Pudc pubd=null;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pubd=" + pubd +
                '}';
    }

    public Pudc getPubd() {
        return pubd;
    }

    public void setPubd(Pudc pubd) {
        this.pubd = pubd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(){
        int s=12;
        String s1 = Convert.toStr(s);
        Pudc pudc=new Pudc();


    }


    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneRuntimeException(e);
        }
    }

}
