package yenyen.models.user;

public class Login {
    private String action;
    private String account_type;
    private String facebook_access_token;
    private String google_access_token;
    private String firebase_token_id;


    public String getAction() {
        return action;
    }

    public Login setAction(String action) {
        this.action = action;
        return this;
    }

    public String getAccount_type() {
        return account_type;
    }

    public Login setAccount_type(String account_type) {
        this.account_type = account_type;
        return this;
    }

    public String getFacebook_access_token() {
        return facebook_access_token;
    }

    public Login setFacebook_access_token(String facebook_access_token) {
        this.facebook_access_token = facebook_access_token;
        return this;
    }

    public String getGoogle_access_token() {
        return google_access_token;
    }

    public Login setGoogle_access_token(String google_access_token) {
        this.google_access_token = google_access_token;
        return this;
    }

    public String getFirebase_token_id() {
        return firebase_token_id;
    }

    public Login setFirebase_token_id(String firebase_token_id) {
        this.firebase_token_id = firebase_token_id;
        return this;
    }
}
