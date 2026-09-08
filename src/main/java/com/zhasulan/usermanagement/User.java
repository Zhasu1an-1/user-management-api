package com.zhasulan.usermanagement;

import jakarta.persistence.*;

@Entity
@Table(name = "profile_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private Integer age;

    public User(){}
    public User(String name, String email, String phone, String password, Integer age){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.age = age;
    }

    public Long getId(){ return this.id; }
    public String getName(){ return this.name; }
    public String getEmail(){ return this.email; }
    public String getPhone(){ return this.phone; }
    public String getPassword(){ return this.password; }
    public Integer getAge(){ return this.age; }

    public void setId(Long id){ this.id = id; }
    public void setName(String name){ this.name = name; }
    public void setEmail(String email){ this.email = email; }
    public void setPhone(String phone){ this.phone = phone; }
    public void setPassword(String password){ this.password = password; }
    public void setAge(Integer age){ this.age = age; }
}
