public class LogIn {
    private UserRepository userRepository;

    public LogIn(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void log (User user) {
        System.out.println("Has access to the website");
        insertUserInDatabase(user);
        // Logic
    }
    public void insertUserInDatabase(User user){
        userRepository.insert(user);
        // Insert user in database
    }
}

