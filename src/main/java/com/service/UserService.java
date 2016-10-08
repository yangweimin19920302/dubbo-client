package com.service;

import com.model.User;

public interface UserService {
    User get(String userId) throws Exception;

    void add(User user) throws Exception;
}