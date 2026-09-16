import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;
public class AuthenticationStressTesting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Predicate<String> validUsername =
                username -> username.length() >= 3
                         && username.length() <= 20;
        Predicate<String> validPassword =
                password -> password.length() >= 6
                         && password.length() <= 20;
        Predicate<String[]> authenticate = credentials -> {
            String username = credentials[0];
            String password = credentials[1];
            return validUsername.test(username)
                    && validPassword.test(password)
                    && username.equals("admin")
                    && password.equals("admin123");
        };
        IntStream.range(0, n).forEach(i -> {
            String username = sc.next();
            String password = sc.next();
            String[] credentials = {username, password};
            try {
                if (authenticate.test(credentials)) {
                    System.out.println("SUCCESS");
                } else {
                    System.out.println("FAILURE");
                }
            } catch (Exception e) {
                System.out.println("FAILURE");
            }
        });
        sc.close();
    }
}
