package com.junit.utils;

public class Game {

    private final Player player;

    public Game(Player player) {
        this.player = player;
    }

    public String attack() {
        return "Player attack with: " + player.getWeapon();
    }
}
