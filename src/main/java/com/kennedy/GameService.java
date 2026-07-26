package com.kennedy;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.List;
@ApplicationScoped
public class GameService {
    public List<Game> getAllGames() {
        return Game.listAll();
    }

    public Game getGameById(Long id) {
        return Game.findById(id);
    }

    public Game createGame(Game game) {
        game.persist();
        return game;
    }

    public boolean deleteGame(Long id) {
        return Game.deleteById(id);
    }




}
