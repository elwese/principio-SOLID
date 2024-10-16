public interface UserRepository {
    void insert(User user);
    User select(String nickname);
    void delete(String nickname);
    void update(User user);
}