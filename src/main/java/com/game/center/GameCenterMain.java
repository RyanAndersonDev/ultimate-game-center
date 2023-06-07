package com.game.center;

import menu.Messages;
import menu.UserGameSelection;
import game.Game;

public class GameCenterMain {
    public static void main(String[] args) {

        System.out.println(Messages.WELCOME_MESSAGE + Messages.USER_PROMPT + Messages.GAMES_PRESENTATION);

        UserGameSelection gameSelection = new UserGameSelection();
        Game selection = gameSelection.getUserInputAndSelectGame();


        selection.runGame();

    }

}