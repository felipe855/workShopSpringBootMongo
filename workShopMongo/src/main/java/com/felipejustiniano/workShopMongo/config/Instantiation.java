package com.felipejustiniano.workShopMongo.config;

import com.felipejustiniano.workShopMongo.domain.User;
import com.felipejustiniano.workShopMongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User maria = new User(null, "Maria", "maria@gmail.com");
        User felipe = new User(null, "felipe", "felipe@gmail.com");
        User stella = new User(null, "stella", "stella@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, felipe, stella));
    }
}
