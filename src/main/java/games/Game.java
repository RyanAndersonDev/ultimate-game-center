package games;

import java.util.HashMap;
import java.util.Map;

public class Game {
    public String name;
    public String id;
    public static Map<String, String> gameMap = new HashMap<>();


    public Game mastermind = new Game("1", "Mastermind");
    public Game terminalCreator = new Game("2", "Terminal Creator");
    public Game uno = new Game("3", "Uno");
    public Game interdimensionalArena = new Game("4", "Interdimensional Arena");


    public Game(String id, String name) {
        this.id = id;
        this.name = name;
        gameMap.put(id, name);
    }


    public String getName() {
        return name;
    }


    public String getId() {
        return id;
    }

}
