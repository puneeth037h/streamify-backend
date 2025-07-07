package com.example.streamify.repo;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.streamify.models.User;

public interface userRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email); // ✅ No static, no method body
}
