import menu.RandomStatementSelector;
import menu.UserInputGameSelector;
import menu.WelcomeMessages;
import games.Game;

import java.util.Scanner;

public class GameCenterMain {
    public static void main(String[] args) {

        System.out.println(WelcomeMessages.WELCOME_MESSAGE);

        UserInputGameSelector gameSelection = new UserInputGameSelector();
        String sanitizedInput = gameSelection.getUserInputAndSelectGame();
//        System.out.println(gameSelection.getUserInputAndSelectGame());
    }
}