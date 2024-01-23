import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[][] arr1 = new int[2][2];
    int[][] arr2 = new int[2][2];
    int[][] arr3 = new int[2][2];
    System.out.println("Enter the numbers for the first matrix");

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        arr1[i][j] = s.nextInt();
      }
    }

    System.out.println("First matrix:");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(arr1[i][j] + " ");
      }
      System.out.println("");
    }

    System.out.println("Enter the numbers for the second matrix");

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        arr2[i][j] = s.nextInt();
      }
    }

    System.out.println("Second matrix:");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(arr2[i][j] + " ");
      }
      System.out.println("");
    }

    System.out.println("Multiplication of 2x2 matrix:");

    for(int i=0;i<2;i++)
      {
        for(int j=0;j<2;j++)
          {
           arr3[i][j]= arr1[i][0]*arr2[0][j] + arr1[i][1]*arr2[1][j];
          }
      }

    System.out.println("Result matrix:");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(arr3[i][j] + " ");
      }
      System.out.println("");
    }
  }
}