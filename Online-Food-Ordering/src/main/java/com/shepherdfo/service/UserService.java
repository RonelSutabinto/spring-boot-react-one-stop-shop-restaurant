package com.shepherdfo.service;

import com.shepherdfo.model.User;

public interface UserService {

    public User findUserByJwtToker(String jwt) throws Exception;

    public User findUserByEmail(String email) throws Exception;
}
