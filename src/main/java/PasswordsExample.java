import org.mindrot.jbcrypt.BCrypt;

public class PasswordsExample {

    public static void main(String[] args) {
        String password = "password123";
        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println("password =" + password);
        System.out.println("hash = " + hash);

        System.out.println("match = " + hash.equals(password));
        System.out.println("match = " + BCrypt.checkpw(password, hash));

    }
}
