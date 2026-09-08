package com.zhasulan.usermanagement;

import jakarta.validation.constraints.*;

public class UserRequestDTO {
    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    @Pattern(regexp = "[A-Za-z]+", message = "Name must contain only letters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email is invalid")
    private String email;

    @NotBlank(message = "Number is required")
    @Pattern(regexp = "\\d{11}", message = "The number has to contain exactly 11 digits")
    private String phone;

    @NotBlank(message = "Password is required")
    @Size(min = 8, max = 50, message = "The password must be between 2 and 50 characters")
    private String password;

    @NotNull(message = "Age is required")
    @Min(value = 0, message = "Age can not be negative number")
    @Max(value = 120, message = "Age must be less than 120")
    private Integer age;

    public UserRequestDTO(){}
    public UserRequestDTO(String name, String email, String phone, String password, Integer age){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.age = age;
    }

    public String getName(){ return this.name; }
    public String getEmail(){ return this.email; }
    public String getPhone(){ return this.phone; }
    public String getPassword(){ return this.password; }
    public Integer getAge(){ return this.age; }

    public void setName(String name){ this.name = name; }
    public void setEmail(String email){ this.email = email; }
    public void setPhone(String phone){ this.phone = phone; }
    public void setPassword(String password){ this.password = password; }
    public void setAge(Integer age){ this.age = age; }
}
