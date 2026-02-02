public class Main {
    public static void main(String[] args) {

        UserManager manager = new UserManager();

        manager.addUser(new User(
                "Dana",
                "dana@mail.com",
                "Admin"
        ));

        manager.updateUser("dana@mail.com", "Dana K.", "User");

        System.out.println("Task completed successfully");
    }
}
