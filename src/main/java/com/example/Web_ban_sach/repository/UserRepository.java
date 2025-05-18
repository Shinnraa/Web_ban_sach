package com.example.Web_ban_sach.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Web_ban_sach.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);

    void deleteById(long id);

    List<User> findOneByEmail(String email);

    List<User> findAll();

    User findById(long id); // null
}
