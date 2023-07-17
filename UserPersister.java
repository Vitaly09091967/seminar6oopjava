public class UserPersister {
    private final User user;

    public UserPersister(User user) {
        this.user = user;
    }

    public void save() {
        Persister persister = new Persister();
        persister.save(user);
    }
}
