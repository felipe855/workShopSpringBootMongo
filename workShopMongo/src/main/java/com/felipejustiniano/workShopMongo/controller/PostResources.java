package com.felipejustiniano.workShopMongo.controller;


import com.felipejustiniano.workShopMongo.domain.Post;
import com.felipejustiniano.workShopMongo.services.PostService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/posts")
public class PostResources {

    @Autowired
    private PostService service;

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) throws BadRequestException {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
