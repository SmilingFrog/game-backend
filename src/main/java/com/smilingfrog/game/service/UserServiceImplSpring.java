package com.smilingfrog.game.service;

import game.game.builder.repository.GameBuilderRepository;
import game.game.repository.GameRepository;
import game.game.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplSpring extends UserServiceImpl {
    @Override
    @Autowired
    public void setAcactiveGamesRepository(GameRepository repo) {
        super.setAcactiveGamesRepository(repo);
    }

    @Override
    @Autowired
    public void setActiveGameBuilderRepository(GameBuilderRepository repo) {
        super.setActiveGameBuilderRepository(repo);
    }


}
