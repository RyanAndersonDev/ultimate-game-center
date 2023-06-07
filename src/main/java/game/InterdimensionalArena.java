package game;

import game.Game;

public class InterdimensionalArena extends Game {
//variables
    private final String NAME = "Interdimensional Arena";

//constructor
    public InterdimensionalArena(){
        setName(NAME);
    }

//Methods
    public void runGame(){ //The Run Game will be the main method for Mastermind
        userNamePrompt();
    }
}
