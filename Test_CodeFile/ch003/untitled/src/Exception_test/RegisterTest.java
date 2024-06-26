package Exception_test;

public class RegisterTest {
    public static void main(String[] args) {
        User user=new User();
        try {
            user.register("mk");
        } catch (IllegalNameException e) {
            throw new RuntimeException(e);
        }
    }
}
