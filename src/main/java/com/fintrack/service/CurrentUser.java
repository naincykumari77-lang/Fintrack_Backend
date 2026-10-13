package com.fintrack.service;
import com.fintrack.model.User; import com.fintrack.repository.UserRepository; import org.springframework.security.core.Authentication; import org.springframework.stereotype.Service;
@Service public class CurrentUser {private final UserRepository repo;public CurrentUser(UserRepository repo){this.repo=repo;}public User get(Authentication a){return repo.findByEmail(a.getName()).orElseThrow(()->new IllegalArgumentException("User not found"));}}
