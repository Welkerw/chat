package com.chat.service;

import com.chat.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}