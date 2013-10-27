public interface Repository {
    void save(User user);
}

public class DatabaseRepository implements Repository { /* ... */ }

public class UserService {
    private final Repository repository;

    UserService(Repository repository) {
        this.repository = repository;
    }

    void create(User user) {
        // ...
        repository.save(user);
    }
}

new UserService(new DatabaseRepository());
