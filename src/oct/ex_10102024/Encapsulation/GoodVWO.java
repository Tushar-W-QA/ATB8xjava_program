package oct.ex_10102024.Encapsulation;

public class GoodVWO {
    private String username;
    private String password;

    public GoodVWO(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password, boolean isadmin) {
        if (isadmin) {
            this.password = password;
        } else {
            System.out.println("Not allowed!!");
        }
    }
}
