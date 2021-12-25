package com.util;

public class JdbcUtil {

    public  JdbcUtil(){
        System.out.println("JdbcUtil的构造方法被调用");
    }


    public JdbcUtil(String url, String password, String username) {
        this.url = url;
        this.password = password;
        this.username = username;
    }

    private String url;
    private String password;
    private String username;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
