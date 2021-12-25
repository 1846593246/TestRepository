package com.util;

import com.servlet.UserServlet;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Resource {

    private String name;

    //希望通过Spring的配置文件 为该dbconfig赋值
    //dbconfig.put("url","jdbc:mysql")  dbconfig.put("username","root")
    //dbconfig.put("password","123")
    private Map<String,String> dbconfig;

    private List<String> list;
    private Set<UserServlet> set;


    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {

        this.properties = properties;
    }

    private Properties properties;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<UserServlet> getSet() {
        return set;
    }

    public void setSet(Set<UserServlet> set) {
        this.set = set;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public Map<String, String> getDbconfig() {
        return dbconfig;
    }

    public void setDbconfig(Map<String, String> dbconfig) {
        System.out.println("spring创建的map类型为:"+ dbconfig.getClass().getName());
        this.dbconfig = dbconfig;
    }
}
