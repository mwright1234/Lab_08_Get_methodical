import java.util.Scanner;
public class FaveNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int favInt = SafeInput.getInt(in, "Enter your favorite integer: ");
        System.out.println("Your favorite integer is: " + favInt);
        double favDouble = SafeInput.getDouble(in, "Enter your favorite double: ");
        System.out.println("Your favorite double is: " + favDouble);

        in.close();
    }

}
