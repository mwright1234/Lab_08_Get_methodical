import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        int maxDaysInMonth = 0;
        switch (birthMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDaysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDaysInMonth = 30;
                break;
            case 2:
                if ((birthYear % 4 == 0 && birthYear % 100 != 0) || (birthYear % 400 == 0)) {
                    maxDaysInMonth = 29;
                } else {
                    maxDaysInMonth = 28;
                }
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        int birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, maxDaysInMonth);
        int birthHour = SafeInput.getRangedInt(in, "Enter the hour of birth", 1, 24);
        int birthMinute = SafeInput.getRangedInt(in, "Enter the minute of birth", 0, 59);

        System.out.println("You were born on: " + birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHour + ":" + birthMinute);

    }
}