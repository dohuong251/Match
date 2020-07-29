package yenyen.models.user;

public class LoginEmail {
    public String getAction() {
        return action;
    }

    public LoginEmail setAction(String action) {
        this.action = action;
        return this;
    }

    public String getAccount_type() {
        return account_type;
    }

    public LoginEmail setAccount_type(String account_type) {
        this.account_type = account_type;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public LoginEmail setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginEmail setPassword(String password) {
        this.password = password;
        return this;
    }

    private String action;
    private String account_type;
    private String email;
    private String password;

}
