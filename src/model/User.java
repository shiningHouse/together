package model;

/**
 * Created by HDY on 2016/3/6.
 */
public class User {
    private String userName;
    private String password;
    private int userID;

    public User()
    {
    }

    public User(String userName, String password)
    {
        this.userName = userName;
        this.password = password;
    }
    public User(String userName,String password,int userID)
    {
        this.userName = userName;
        this.password = password;
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
