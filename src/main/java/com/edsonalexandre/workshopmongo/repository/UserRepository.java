package com.edsonalexandre.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.edsonalexandre.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}