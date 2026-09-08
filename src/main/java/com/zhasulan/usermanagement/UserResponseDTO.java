package com.zhasulan.usermanagement;

public class UserResponseDTO {
    private String name;
    private String email;
    private String phone;
    private Integer age;

    public UserResponseDTO(){}
    public UserResponseDTO(String name, String email, String phone, Integer age){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getName(){ return this.name; }
    public String getEmail(){ return this.email; }
    public String getPhone(){ return this.phone; }
    public Integer getAge(){ return this.age; }
}
