import java.util.ArrayList;

public abstract class Game {
//variables
    private String name;
    private int numberOfPlayers;
    private ArrayList<User> userArrayList = new ArrayList<>();

//getters
    public String getName() {
        return name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }


    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

//methods
    public void addUser(User newUser){
        userArrayList.add(newUser);
    }

//required methods
    public abstract void runGame();
}
