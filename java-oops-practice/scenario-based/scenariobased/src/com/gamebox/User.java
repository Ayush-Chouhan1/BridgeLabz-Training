package com.gamebox;

import java.util.ArrayList;
import java.util.List;

class User {

    private String username;
    private List<Game> ownedGames;

    public User(String username) {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    // Controlled access
    public void purchaseGame(Game game) {
        ownedGames.add(game);
        System.out.println(" " + game.getTitle() + " added to library");
    }

    public void showLibrary() {
        System.out.println("\n " + username + " Game Library:");
        for (Game g : ownedGames) {
            System.out.println(g.getTitle() + " " + g.getPrice());
        }
    }
}
