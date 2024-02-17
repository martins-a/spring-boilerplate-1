package com.example.augustoboilerplate.repository;

import com.example.augustoboilerplate.model.GameBacklog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameBacklogRepository extends MongoRepository<GameBacklog, String> {
}
