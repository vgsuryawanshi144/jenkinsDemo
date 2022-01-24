package com.fertilizers.agency;

import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fertilizers.agency.service.EmailService;

import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SendEmailApplicationTest {

    @Autowired
    private EmailService emailService;

    @Test
    public void testEmail() {
        emailService.sendMail("add client mail address", "Test subject", "Test mail");
    }
}