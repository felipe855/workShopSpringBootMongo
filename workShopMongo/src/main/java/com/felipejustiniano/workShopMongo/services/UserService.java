package com.felipejustiniano.workShopMongo.services;

import com.felipejustiniano.workShopMongo.domain.User;
import com.felipejustiniano.workShopMongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
