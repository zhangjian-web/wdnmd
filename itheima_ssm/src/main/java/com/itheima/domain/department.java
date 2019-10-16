package com.itheima.domain;/*
包名:com.itheima.domain
创建者:ZJ
日期:2019-09-20 10:52
*/

public class department {
    private String name;
    private  Integer id;

    @Override
    public String toString() {
        return "department{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
