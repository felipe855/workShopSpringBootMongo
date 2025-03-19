package com.felipejustiniano.workShopMongo.config;

import com.felipejustiniano.workShopMongo.domain.Post;
import com.felipejustiniano.workShopMongo.domain.User;
import com.felipejustiniano.workShopMongo.dto.AuthorDto;
import com.felipejustiniano.workShopMongo.repository.PostRepository;
import com.felipejustiniano.workShopMongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();
        postRepository.deleteAll();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();

        User maria = new User(null, "Maria", "maria@gmail.com");
        User felipe = new User(null, "felipe", "felipe@gmail.com");
        User stella = new User(null, "stella", "stella@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, felipe, stella));

        Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo", new AuthorDto(maria));
        Post post2 = new Post(null, sdf.parse("22/03/2018"), "Fiz compras", "Comprei umas coisas", new AuthorDto(maria));


        postRepository.saveAll(Arrays.asList(post1, post2));
    }
}
