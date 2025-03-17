package com.felipejustiniano.workShopMongo.resouces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.felipejustiniano.workShopMongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class userResources {

    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1", "Maria Silva", "maria@gmail.com");
        User madalena = new User("2", "Madalena Silva", "madalenasilva@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, madalena));
        return ResponseEntity.ok().body(list);
    }
}
