package com.example.Web_ban_sach.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Web_ban_sach.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}