package com.kennedy;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
@Path("/games")
public class GameController {
    @Inject
    GameService gameService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }
    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Game getGameById(Long Id) {
        return gameService.getGameById(Id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Game createGame(Game game) {
        return gameService.createGame(game);
    }
    @Path("/{id}")
    @DELETE
    public boolean deleteGame(Long id) {
        return gameService.deleteGame(id);
    }

}
