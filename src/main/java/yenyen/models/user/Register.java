package yenyen.models.user;

public class Register {
   private String action;
   private String username;
    private String email;
   private String password;
   private String password_confirmation;

    public Register(){

    }

    public String getAction() {
        return action;
    }

    public Register setAction(String action) {
        this.action = action;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Register setUserName(String userName){
        this.username = userName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Register setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Register setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword_confirmation() {
        return password_confirmation;
    }

    public Register setPassword_confirmation(String password_confirmation) {
        this.password_confirmation = password_confirmation;
        return this;
    }

    private Register(RegisterBuilder builder) {
        this.action=builder.action;
        this.username=builder.username;
        this.email=builder.email;
        this.password=builder.password;
        this.password_confirmation=builder.password_confirmation;
    }


    public static class RegisterBuilder{
        private String action;
        private String username;
        private String email;
        private String password;
        private String password_confirmation;

        public RegisterBuilder(String username, String email, String password){
            this.username = username;
            this.email = email;
            this.password = password;

        }
        public RegisterBuilder setAction(String action) {
            this.action = action;
            return this;
        }

        public RegisterBuilder setPassword_confirmation(String password_confirmation) {
            this.password_confirmation = password_confirmation;
            return this;
        }

        public Register build(){

            return new Register(this);
        }


   }
}
