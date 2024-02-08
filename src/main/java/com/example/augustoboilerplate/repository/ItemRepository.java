package com.example.augustoboilerplate.repository;

import com.example.augustoboilerplate.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {

}
