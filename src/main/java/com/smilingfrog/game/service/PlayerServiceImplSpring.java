package com.smilingfrog.game.service;

import game.game.builder.repository.GameBuilderRepository;
import game.game.repository.GameRepository;
import game.game.services.PlayerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImplSpring extends PlayerServiceImpl {

    @Override
    @Autowired
    public void setAcactiveGamesRepository(GameRepository gameRepository) {
        super.setAcactiveGamesRepository(gameRepository);
    }

    @Override
    @Autowired
    public void setActiveGameBuilderRepository(GameBuilderRepository gameBuilderRepository) {
        super.setActiveGameBuilderRepository(gameBuilderRepository);
    }
}
