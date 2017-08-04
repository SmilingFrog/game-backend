package com.smilingfrog.game.model;

import java.util.List;

public class CreateNewGameRequestDTO {
    public int playersNum;
    public List<PlayerDataDTO> players;
    public PlayerDataDTO playerToRegister;
}
