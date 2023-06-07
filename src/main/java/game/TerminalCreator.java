package game;

import game.Game;

public class TerminalCreator extends Game {
//variables
    private final String NAME = "Terminal Creator";

//constructor
    public TerminalCreator(){
        setName(NAME);
    }

//Methods
    public void runGame(){ //The Run game.game.Game will be the main method for game.Mastermind
        System.out.println("Terminal Creator is running!"); //placeholder test for running from menu
    }
}
