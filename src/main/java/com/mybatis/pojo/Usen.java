package com.mybatis.pojo;

public class Usen {
    private  Integer id;
    private  String usename;
    private  String password;
    private  Integer age;
    private String sex;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usen(Integer id, String usename, String password, Integer age, String sex, String email) {
        this.id = id;
        this.usename = usename;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    public Usen() {
    }

    @Override
    public String toString() {
        return "Usen{" +
                "id=" + id +
                ", usename='" + usename + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
