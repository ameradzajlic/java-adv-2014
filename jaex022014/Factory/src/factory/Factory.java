package factory;
public class Factory {
    public static void main(String[] args) {
        String user = "superadministrator";
        User u = UserFactory.newUser(user);
    }
}
