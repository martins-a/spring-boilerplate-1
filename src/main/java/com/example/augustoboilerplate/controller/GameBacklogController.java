package com.example.augustoboilerplate.controller;

import com.example.augustoboilerplate.dto.AddGameBacklogRequest;
import com.example.augustoboilerplate.dto.CompleteGameBacklogRequest;
import com.example.augustoboilerplate.model.GameBacklog;
import com.example.augustoboilerplate.service.GameBacklogService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    // Simply put, the @PathVariable annotation can be used to handle template variables in the request URI mapping, and set them as method parameters.
    @PutMapping("/completed/{id}")
    public ResponseEntity<GameBacklog> completeGameBacklog(@PathVariable String id,
                                                      @RequestBody CompleteGameBacklogRequest request) {


        GameBacklog result = gameBacklogService.completeGameOnBacklog(id, request.getFinalScore());

        if ( result != null ) {
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.notFound().build();
        }

    }


}
