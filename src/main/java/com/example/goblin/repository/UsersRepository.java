package com.example.goblin.repository;

import com.example.goblin.data.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, String> {

}
