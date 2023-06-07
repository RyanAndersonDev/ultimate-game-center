package game;

public class User {
//variables
    private String userName;

//constructor

    public User(String name) {
        this.userName = name;
    }


//getters

    public String getUserName() {
        return userName;
    }
//setter

    public void setUserName(String name) {
        this.userName = name;
    }
}
