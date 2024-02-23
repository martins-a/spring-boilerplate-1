package com.example.augustoboilerplate.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateGameBacklogRequest {

    private String gameTitle;

    private Date createDate;

    private Date conclusionDate;

    private int hypeFactor;

    private int finalScore;

}
