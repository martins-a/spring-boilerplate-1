package com.example.augustoboilerplate.service.impl;

import com.example.augustoboilerplate.service.ItemService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TestServiceImplTest {

    @InjectMocks
    private ItemServiceImpl itemService;

    @Test
    void getMessage() {
        String item = itemService.getItem();
        String item2 = itemService.getItem();
    }
}