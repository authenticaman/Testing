package com.exam.service;

import com.exam.model.*;
import java.util.*;

public interface UserService{

    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by username
    public User getUser(String username);

    //delete user by id
    public void deleteUser(Long userId);

    //update user by id
    //public void updateUser(Long userId);
}
