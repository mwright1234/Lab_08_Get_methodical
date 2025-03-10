import java.util.Scanner;
public class reggie {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN (format: XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN Entered: " + ssn);
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (M#####)", "^(M|m)\\d{6}$");
        System.out.println("M Number Entered: " + mNumber);
        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O, S, V, Q)", "^[OoSsVvQq]$");
        System.out.println("Menu Choice Entered: " + menuChoice);

        in.close();

    }
}
