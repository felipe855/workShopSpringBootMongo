package com.felipejustiniano.workShopMongo.repository;

import com.felipejustiniano.workShopMongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
