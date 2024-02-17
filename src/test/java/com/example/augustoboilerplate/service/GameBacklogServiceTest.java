package com.example.augustoboilerplate.service;

import com.example.augustoboilerplate.dto.AddGameBacklogRequest;
import com.example.augustoboilerplate.model.GameBacklog;
import com.example.augustoboilerplate.repository.GameBacklogRepository;
import com.example.augustoboilerplate.service.impl.GameBacklogServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class GameBacklogServiceTest {

    @Mock
    GameBacklogRepository gameBacklogRepository;

    @InjectMocks
    GameBacklogServiceImpl gameBacklogService;

    @Test
    void createGameBacklog() {

        AddGameBacklogRequest request = AddGameBacklogRequest
                .builder()
                .gameTitle("test")
                .hypeFactor(5).build();

        gameBacklogService.createGameBacklog(request);

        //Mockito Verify methods are used to check that certain behavior happened
        verify(gameBacklogRepository).insert(Mockito.any(GameBacklog.class));


    }
}