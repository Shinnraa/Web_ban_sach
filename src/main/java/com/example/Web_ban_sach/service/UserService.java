package com.example.Web_ban_sach.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Web_ban_sach.domain.User;
import com.example.Web_ban_sach.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String handle() {
        return "Hello World";
    }

    public List<User> getAllUser() {
        return this.userRepository.findAll();
    }

    public User getUserById(long id) {
        return this.userRepository.findById(id);
    }

    public List<User> getAllUsersByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public User handleSaveUser(User user) {
        return this.userRepository.save(user);
    }

    public void DeleteAUser(long id) {
        this.userRepository.deleteById(id);
    }
}
