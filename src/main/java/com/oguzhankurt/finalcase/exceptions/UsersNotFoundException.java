package com.oguzhankurt.finalcase.exceptions;

public class UsersNotFoundException extends RuntimeException{

    private Long serialID = 85185919491L;

    public UsersNotFoundException(String msg) {
        super(msg);
    }


}