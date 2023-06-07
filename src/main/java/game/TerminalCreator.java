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
    public void runGame(){ //The Run Game will be the main method for Mastermind
        userNamePrompt();
    }
}
