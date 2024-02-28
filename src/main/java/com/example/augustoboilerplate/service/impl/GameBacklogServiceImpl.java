package com.example.augustoboilerplate.service.impl;

import com.example.augustoboilerplate.constant.ErrorCode;
import com.example.augustoboilerplate.dto.AddGameBacklogRequest;
import com.example.augustoboilerplate.dto.UpdateGameBacklogRequest;
import com.example.augustoboilerplate.exception.NotFoundException;
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

    @Override
    public void createGameBacklog(AddGameBacklogRequest request) {

        GameBacklog backlogItem = GameBacklog.builder()
                .gameTitle(request.getGameTitle())
                .hypeFactor(request.getHypeFactor())
                .createDate(new Date())
                .build();

        gameBacklogRepository.insert(backlogItem);

    }

    @Override
    public GameBacklog completeGameOnBacklog(String id, int finalScore) {

        // check if the game backlog exists
        if ( !gameBacklogRepository.existsById(id) ) {
            // handle not existent item scenario
            throw new NotFoundException(ErrorCode.GAME_BACKLOG_NOT_FOUND);
        }

        // get the current backlog
        GameBacklog currentBacklogItem = gameBacklogRepository.findById(id).orElse(null);

        if ( currentBacklogItem != null ) {

            currentBacklogItem.setFinalScore(finalScore);

            return gameBacklogRepository.save(currentBacklogItem);

        }

        return null;

    }

    @Override
    public void deleteGameBacklog(String id) {

        // check if the game backlog exists
        if ( !gameBacklogRepository.existsById(id) ) {
            // handle not existent item scenario
            throw new NotFoundException(ErrorCode.GAME_BACKLOG_NOT_FOUND);
        }

        // Delete
        gameBacklogRepository.deleteById(id);


    }

    @Override
    public GameBacklog updateGameBacklog(String id, UpdateGameBacklogRequest request) {

        // check if the game backlog exists
        if ( !gameBacklogRepository.existsById(id) ) {
            // handle not existent item scenario
            throw new NotFoundException(ErrorCode.GAME_BACKLOG_NOT_FOUND);
        }

        // get the current backlog
        GameBacklog currentBacklogItem = gameBacklogRepository.findById(id).orElse(null);

        if ( currentBacklogItem != null ) {

            if ( request.getFinalScore() > 0 ) {
                currentBacklogItem.setFinalScore(request.getFinalScore());
            }

            if ( request.getConclusionDate() != null ) {
                currentBacklogItem.setConclusionDate(request.getConclusionDate());
            }

            if ( request.getGameTitle() != null ) {
                currentBacklogItem.setGameTitle(request.getGameTitle());
            }

            if ( request.getHypeFactor() > 0 ) {
                currentBacklogItem.setHypeFactor(request.getHypeFactor());
            }

            if ( request.getConclusionDate() != null ) {
                currentBacklogItem.setConclusionDate(request.getConclusionDate());
            }

            return gameBacklogRepository.save(currentBacklogItem);

        }

        return null;

    }

}
