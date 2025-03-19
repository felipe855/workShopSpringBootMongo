package com.felipejustiniano.workShopMongo.services;

import com.felipejustiniano.workShopMongo.domain.User;
import com.felipejustiniano.workShopMongo.dto.UserDto;
import com.felipejustiniano.workShopMongo.repository.UserRepository;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) throws BadRequestException {
        Optional<User> user = repo.findById(id);
        if (user.isEmpty()) {
            throw new BadRequestException("Objeto não encontado");
        }
        return user.get();
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public void delete(String id) throws BadRequestException {
        findById(id);
        repo.deleteById(id);
    }

    public User fromDto(UserDto objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
