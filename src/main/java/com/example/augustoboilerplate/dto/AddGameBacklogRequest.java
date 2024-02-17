package com.example.augustoboilerplate.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddGameBacklogRequest {

    private String gameTitle;

    private int hypeFactor;

    @Override
    public String toString() {
        return "AddGameBacklogRequest{" +
                "gameTitle='" + gameTitle + '\'' +
                ", hypeFactor=" + hypeFactor +
                '}';
    }
}
