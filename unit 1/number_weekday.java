import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check the weekday:");
        int a = s.nextInt();
        String day;
        if (1 <= a && a <= 7) {
            switch (a) {
                case 1:
                    day = "Monday";
                System.out.println("The number is " + a + " and the weekday is " + day);
                    break;
                case 2:
                    day = "Tuesday";
                System.out.println("The number is " + a + " and the weekday is " + day);
                    break;
                case 3:
                    day = "Wednesday";
                System.out.println("The number is " + a + " and the weekday is " + day);
                    break;
                case 4:
                    day = "Thursday";
                System.out.println("The number is " + a + " and the weekday is " + day);
                    break;
                case 5:
                    day = "Friday";
                System.out.println("The number is " + a + " and the weekday is " + day);
                    break;
                case 6:
                    day = "Saturday";
                System.out.println("The number is " + a + " and the weekday is " + day);
                    break;
                case 7:
                    day = "Sunday";
                System.out.println("The number is " + a + " and the weekday is " + day);
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }

        } else {
            System.out.println("The entered option is not valid.");
        }
    }
}
