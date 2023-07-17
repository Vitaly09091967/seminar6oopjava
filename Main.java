public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        user.report();
        UserPersister persister = new UserPersister(user);
        persister.save();
    }
}
    

