package com.greenfox.connection;

import com.greenfox.connection.model.Todo;
import com.greenfox.connection.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionApplication implements CommandLineRunner {

	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ConnectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
		todoRepository.save(new Todo("Feed the cat"));
	}
}
