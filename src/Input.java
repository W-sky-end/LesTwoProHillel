import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getIntInput (String message) {
        System.out.println(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Wrong number!Try again.");
            scanner.nextInt();
        }
        return scanner.nextInt();
    }
    public static String getStringInput (String message){
        System.out.println(message);
        return scanner.next();

    }
}
