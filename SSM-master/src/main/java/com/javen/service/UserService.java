package com.javen.service;  

import com.javen.model.User;


public interface UserService {

    public User getUserById(int userId);

    public User queryUser(User user);
}  