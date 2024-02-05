package com.springbootcourse.course.resources;

import com.springbootcourse.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Robson", "robson@email.com", "45454545", "123");
        return ResponseEntity.ok().body(user);
    }
}
