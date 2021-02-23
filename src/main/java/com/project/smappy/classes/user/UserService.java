package com.project.smappy.classes.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {
        return List.of(
            new User(
                "Kebinsan",
                "prokevint@gmail.com",
                "password"
            )
        );
    }
}
