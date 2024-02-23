package com.example.augustoboilerplate.service;

import com.example.augustoboilerplate.dto.AddGameBacklogRequest;
import com.example.augustoboilerplate.dto.UpdateGameBacklogRequest;
import com.example.augustoboilerplate.model.GameBacklog;

public interface GameBacklogService {
    void createGameBacklog(AddGameBacklogRequest request);
    GameBacklog completeGameOnBacklog(String id, int finalScore);

    GameBacklog updateGameBacklog(String id, UpdateGameBacklogRequest request);
}
