package com.smilingfrog.game.controller;

import com.smilingfrog.game.model.CreateNewGameRequestDTO;
import com.smilingfrog.game.model.PlayerDataDTO;
import game.game.blueprint.GameBlueprint;
import game.game.blueprint.GameBlueprintImpl;
import game.game.player.PlayerType;
import game.game.player.data.PlayerData;
import game.game.player.data.PlayerDataImpl;
import game.game.responses.NewGameResponse;
import game.game.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3888")
@RestController
public class GameController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public NewGameResponse test(@RequestBody CreateNewGameRequestDTO newGameRequest) {
        GameBlueprint gameBlueprint = new GameBlueprintImpl();
        gameBlueprint.setPlayersNumber(newGameRequest.playersNum);
        List<PlayerDataDTO> playersDTO = newGameRequest.players;

        for( PlayerDataDTO playerDTO : playersDTO){
            PlayerData player = new PlayerDataImpl();
            player.setPlayerName(playerDTO.playerName);
            player.setIntelect(playerDTO.intelect);
            PlayerType playerType = PlayerType.valueOf(playerDTO.playerType);
            player.setPlayerType(playerType);
            gameBlueprint.addPlayer(player);
        }

        PlayerDataDTO playerDTO = newGameRequest.playerToRegister;
        PlayerData playerToRegister = new PlayerDataImpl();
        playerToRegister.setPlayerName(playerDTO.playerName);
        PlayerType playerType = PlayerType.valueOf(playerDTO.playerType);
        playerToRegister.setPlayerType(playerType);
        gameBlueprint.setPlayerDataToRegisister(playerToRegister);

        NewGameResponse newGameResponse = userService.createGame(gameBlueprint);
        return newGameResponse;
    }


}
