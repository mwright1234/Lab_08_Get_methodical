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

        // Test getRangedDouble method with range [1, 10]
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double", 1, 10);
        System.out.println("you entered: " + rangedDouble);

        // test getYNConfirm method
        boolean yesNo = SafeInput.getYNConfirm(in, "Enter yes or no");
        System.out.println("you entered: " + yesNo);

        String phoneNumber = SafeInput.getRegExString(in, "Enter your phone number", "^(\\(\\d{3}\\)\\s?|\\d{3})\\d{3}-?\\d{4}$");
        System.out.println("You entered: " + phoneNumber);


        in.close();
    }
}
