package com.springbootcourse.course.config;

import com.springbootcourse.course.entities.User;
import com.springbootcourse.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
//        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
//        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
//
//        userRepository.saveAll(List.of(u1, u2));
    }
}
