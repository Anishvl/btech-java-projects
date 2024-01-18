import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.println("Enter the year here");
        a = s.nextInt();

        if (a % 400 == 0 || a % 100 == 0 || a % 4 == 0) {
            System.out.println("It's a leap year");
        } else {
            System.out.println("It's not a leap year");
        }
    }
}
