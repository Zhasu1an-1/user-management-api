package com.zhasulan.usermanagement;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<UserResponseDTO> takeUsers(){
        return userService.takeAllUsers();
    }
    @GetMapping("/users/{id}")
    public UserResponseDTO takeUser(@PathVariable Long id){
        return userService.takeUserById(id);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id){
        return userService.deleteUserById(id);
    }

    @PostMapping("/auth/login")
    public String userLogin(@RequestBody UserRequestDTO user){
        return userService.login(user);
    }

    @PutMapping("/users/{id}")
    public String updateUser(
            @PathVariable Long id,
            @RequestBody User user
    ){
        return userService.updateUserById(id, user);
    }
}
