package com.example.augustoboilerplate.controller;

import com.example.augustoboilerplate.dto.AddGameBacklogRequest;
import com.example.augustoboilerplate.service.GameBacklogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/game-backlog")
public class GameBacklogController {


    @Autowired
    private GameBacklogService gameBacklogService;

    // @RequestBody is used to extract the HTTP request body data, often in JSON or XML format, and deserialize it into a Java object.
    // @RequestParam is used to extract individual parameter values from the request URL or submitted form data.

    @PostMapping
    public ResponseEntity<String> createGameBacklog(@RequestBody AddGameBacklogRequest request) {

        gameBacklogService.createGameBacklog(request);
        return ResponseEntity.ok("Game backlog created.");

    }


}
