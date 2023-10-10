package MikaelBarachoOficial.com.github.todolist_backend.user;

public class UserModel {

    private String userName;
    private String name;
    private String password;

    // getters setters:

    // UserName
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    // Name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Password
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
