import javax.naming.Name;
import java.util.Scanner;

public class Uno extends Game{
//variables
    private final String NAME = "Uno";

//constructor
    public Uno(){
        setName(NAME);
    }

//Methods
    public void runGame(){ //The Run Game will be the main method for Uno
        multiUserNamePrompt();
        System.out.println("Uno is running!"); //placeholder test for running from menu
    }

}
