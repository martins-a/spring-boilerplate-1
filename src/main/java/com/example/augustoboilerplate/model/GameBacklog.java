package com.example.augustoboilerplate.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Builder
@Document(collection = "game-backlog")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameBacklog {

    @Id
    private String id;

    private String gameTitle;

    private Date createDate;

    private Date conclusionDate;

    private int hypeFactor;

    private int finalScore;


}
