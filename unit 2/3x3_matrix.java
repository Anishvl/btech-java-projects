import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int arr[][] = new int[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("Enter at row = " + (i + 1) + " and column = " + (j + 1));
        arr[i][j] = s.nextInt();
      }
    }

    System.out.println("Entered Array:");

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println("");
    }
  }
}
