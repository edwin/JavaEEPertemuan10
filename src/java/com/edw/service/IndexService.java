package com.edw.service;

import org.springframework.stereotype.Service;

@Service
public class IndexService {

    public String doSomething(String username) {
        return "welcome "+username;
    }
    
}
