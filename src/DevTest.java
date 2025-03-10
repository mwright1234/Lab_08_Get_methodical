import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString method
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        // Test getInt method
        int userInt = SafeInput.getInt(in, "Please enter an integer: ");
        System.out.println("You entered: " + userInt);

        // Test getDouble method
        double userDouble = SafeInput.getDouble(in, "Please enter a double: ");
        System.out.println("You entered: " + userDouble);

        // Test getRangedInt method with range [1, 10]
        int rangedInt = SafeInput.getRangedInt(in, "Enter a number", 1, 10);
        System.out.println("You entered: " + rangedInt);

        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double", 1, 10);
        System.out.println("you entered: " + rangedDouble);

        in.close();
    }
}
