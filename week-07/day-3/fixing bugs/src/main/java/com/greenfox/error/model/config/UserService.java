package com.greenfox.error.model.config;

import com.greenfox.error.model.model.User;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by aze on 25/10/17.
 */

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
