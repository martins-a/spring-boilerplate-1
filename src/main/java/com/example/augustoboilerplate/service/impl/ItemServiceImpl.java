package com.example.augustoboilerplate.service.impl;

import com.example.augustoboilerplate.service.ItemService;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    public String getItem() {
        return "these are the items";
    }

}
