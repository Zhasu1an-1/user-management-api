package com.zhasulan.usermanagement;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    // DTO methods
    public UserResponseDTO makeDTO( User user){
        return new UserResponseDTO(
                user.getName(),
                user.getEmail(),
                user.getPhone(),
                user.getAge()
        );
    }
    public User makeUser(UserRequestDTO dto_user){
        return new User(
                dto_user.getName(),
                dto_user.getEmail(),
                dto_user.getPhone(),
                dto_user.getPassword(),
                dto_user.getAge()
        );
    }

    // GET
    public List<UserResponseDTO> takeAllUsers(){
        List<User> users = userRepository.findAll();
        List<UserResponseDTO> res_users = new ArrayList<>(users.size());
        for (User i : users) res_users.add(makeDTO(i));
        return res_users;
    }
    public UserResponseDTO takeUserById(Long id){
        Optional<User> o_user = userRepository.findById(id);
        User user = o_user.orElseThrow(
                () -> new RuntimeException("User not found")
        );
        return makeDTO(user);
    }

    //DELETE
    public String deleteUserById(Long id){
        userRepository.deleteById(id);
        return "User was deleted";
    }

    //POST
    public String login(UserRequestDTO user){
        userRepository.save(makeUser(user));
        return "User was saved";
    }

    //PUT
    public String updateUserById(Long id, User newUser){
        Optional<User> currentUser = userRepository.findById(id);
        if(currentUser.isPresent()){
            User user = currentUser.get();
            user.setName(newUser.getName());
            user.setEmail(newUser.getEmail());
            user.setPhone(newUser.getPhone());
            user.setPassword(newUser.getPassword());
            user.setAge(newUser.getAge());
            userRepository.save(user);
            return "User was updated";
        }
        return "User not found";
    }
}
