package com.panda.sputnik.demo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@Slf4j
@ActiveProfiles("test")
@SpringBootTest(
        // classes = App.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = {
//                "application.porscheUser.jwt.issuer=http://login.localhost"
                "MY_HOST=super-duper-host"
        })
public class TestApp {
    
}
