package com.codex.freshvotes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.codex.freshvotes.model.User;
import com.codex.freshvotes.repository.UserRepository;
import com.codex.freshvotes.security.Authority;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository UserRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User save(User user) {
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		Authority authority = new Authority();
		authority.setAuthority("ROLE_USER");
		authority.setUser(user);
		user.getAuthorities().add(authority);
		return UserRepository.save(user);
	}

}
