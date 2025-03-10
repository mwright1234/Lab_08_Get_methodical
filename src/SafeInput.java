import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int retValue = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print(prompt);
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                validInput = true;
            } else {
                System.out.println("You did not enter an integer.");
                pipe.next();
            }
            pipe.nextLine();
        }
        return retValue;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double value = 0;
        boolean done = false;
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                System.out.println("You entered an incorrect input. Please enter a valid double.");
                pipe.next();
            }
        } while (!done);
        return value;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retValue = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                if (retValue >= low && retValue <= high) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a number between " + low + " and " + high + ".");
                }
            } else {
                System.out.println("You did not enter an integer.");
                pipe.next();
            }
            pipe.nextLine();
        }
        return retValue;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double doubleVal = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                doubleVal = pipe.nextDouble();
                if (doubleVal >= low && doubleVal <= high) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a double between " + low + " and " + high + ".");
                }
            } else {
                System.out.println("You did not enter a double .");
                pipe.next();
            }
            pipe.nextLine();
        }
        return doubleVal;
    }

public static boolean getYNConfirm(Scanner pipe, String prompt){
        boolean yesOrNo;
        boolean done = false;

        do {
            System.out.print(prompt + ": ");



        }
        while(!done);

}

}
