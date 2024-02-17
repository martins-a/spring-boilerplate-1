package com.example.augustoboilerplate.service.impl;

import com.example.augustoboilerplate.dto.AddGameBacklogRequest;
import com.example.augustoboilerplate.model.GameBacklog;
import com.example.augustoboilerplate.repository.GameBacklogRepository;
import com.example.augustoboilerplate.service.GameBacklogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GameBacklogServiceImpl implements GameBacklogService {

    @Autowired
    private GameBacklogRepository gameBacklogRepository;

    public void createGameBacklog(AddGameBacklogRequest request) {

        GameBacklog backlogItem = GameBacklog.builder()
                .gameTitle(request.getGameTitle())
                .hypeFactor(request.getHypeFactor())
                .createDate(new Date())
                .build();

        gameBacklogRepository.insert(backlogItem);

    }

}
