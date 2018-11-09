package com.thinkive.workspace.userservice.bean;

/**
 * @描述:
 * @作者: 袁祖平
 * @创建日期: 2018年11月08日   10:31:38
 * @修改者: 袁祖平
 * @修改时间: 2018年11月08日   10:31:38
 */
public class User {
    private Long id;
    private String account;
    private String name;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
