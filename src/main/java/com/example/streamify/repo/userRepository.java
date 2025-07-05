package com.example.streamify.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.streamify.models.user;

public interface userRepository extends MongoRepository<user,String>{

}
