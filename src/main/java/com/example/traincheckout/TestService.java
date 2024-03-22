package com.example.traincheckout;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public void doTest(){
        throw new RuntimeException("Service Exception");
    }
}
