import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String userName = SafeInput.getZeroLengthString(in, "Enter your name");

        System.out.println("Hello, " + userName);
        in.close();




    }
}
