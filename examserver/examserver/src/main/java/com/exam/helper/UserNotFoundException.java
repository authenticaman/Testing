package com.exam.helper;

public class UserNotFoundException extends Exception{

    public UserNotFoundException() {
        super("User with this username not Found in Database !!");
    }

    public UserNotFoundException(String msg) {super(msg);}
}
