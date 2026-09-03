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
    private int age;

    User(){}
    User(String name, String email, String phone, int age){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public Long getId(){ return this.id; }
    public String getName(){ return this.name; }
    public String getEmail(){ return this.email; }
    public String getPhone(){ return this.phone; }
    public int getAge(){ return this.age; }

    public void setId(Long id){ this.id = id; }
    public void setName(String name){ this.name = name; }
    public void setEmail(String email){ this.email = email; }
    public void setPhone(String phone){ this.phone = phone; }
    public void setAge(int age){ this.age = age; }
}
