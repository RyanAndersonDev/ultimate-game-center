import menu.UserGameSelection;
import menu.Messages;

public class GameCenterMain {
    public static void main(String[] args) {

        System.out.println(Messages.WELCOME_MESSAGE + Messages.USER_PROMPT + Messages.GAMES_PRESENTATION);

        UserGameSelection gameSelection = new UserGameSelection();
        gameSelection.getUserInputAndSelectGame();

    }
}