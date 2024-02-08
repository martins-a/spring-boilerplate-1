package com.example.augustoboilerplate.service.impl;

import com.example.augustoboilerplate.model.Item;
import com.example.augustoboilerplate.repository.ItemRepository;
import com.example.augustoboilerplate.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public String getMessage() {
        try {
            String message = "message from service: ok";
            List<Item> items = itemRepository.findAll();
            return message;
        } catch(Exception e) {
            throw e;
        }

    }

}
