package com.zhasulan.usermanagement;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> takeAllUsers(){
        return userRepository.findAll();
    }
    public Optional<User> takeUserById(Long id){
        return userRepository.findById(id);
    }
    public String deleteUserById(Long id){
        userRepository.deleteById(id);
        return "User was deleted";
    }
    public String login(User user){
        userRepository.save(user);
        return "User was saved";
    }
    public String updateUserById(Long id, User newUser){
        Optional<User> currentUser = userRepository.findById(id);
        if(currentUser.isPresent()){
            User user = currentUser.get();
            user.setName(newUser.getName());
            user.setEmail(newUser.getEmail());
            user.setPhone(newUser.getPhone());
            user.setAge(newUser.getAge());
            userRepository.save(user);
            return "User was updated";
        }
        return "User not found";
    }
}
