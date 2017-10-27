package com.greenfox.error.config;

import com.greenfox.error.model.User;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserService {

    private ArrayList<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    public ArrayList<User> getAll() {
        return users;
    }

    public void save(User user) {
        users.add(user);
    }

    @Bean
    public UserService service() {
        return new UserService();
    }
}
