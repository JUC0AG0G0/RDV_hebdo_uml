package org.example;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private final List<Player> players = new ArrayList<>();
    private Player lastPlayer;

    public int getNumberOfPlayer() {
        return players.size();
    }

    public Player playerSits(String name) {
        Player p = new Player(name, this);
        players.add(p);
        return p;
    }

    public Player getLastPlayer() {
        return lastPlayer;
    }

    public void setLastPlayer(Player lastPlayer) {
        this.lastPlayer = lastPlayer;
    }

    public int getPlayerPosition(Player p) {
        return players.indexOf(p);
    }
}
