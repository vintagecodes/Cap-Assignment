package com.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.service.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

	User findByUserId(long userId);

}
