package com.junit.utils;

import java.util.List;

public class GameWithOpponent {

    private Player player;

    private List<String> opponents;

    public GameWithOpponent(Player player, List<String> opponents) {
        this.player = player;
        this.opponents = opponents;
    }

    public int numberOfEnemies() {
        return opponents.size();
    }

    public String attack() {
        return "Player attack with: " + player.getWeapon();
    }
}
