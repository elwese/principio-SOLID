public class AppWeb {
    LogIn logIn;
    LogInAdmin logInAdmin;
    
     // Constructor
    public AppWeb(LogIn logIn, LogInAdmin logInAdmin) {
        this.logIn = logIn;
        this.logInAdmin = logInAdmin;
    }

    public void userLogin(User user) {
        logIn.log(user);
    }

    public void adminLogin(User user) {
        logInAdmin.log(user);
    }
}



