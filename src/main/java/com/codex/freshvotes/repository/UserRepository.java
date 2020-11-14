package com.codex.freshvotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codex.freshvotes.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	User findByUsername(String username);
}
