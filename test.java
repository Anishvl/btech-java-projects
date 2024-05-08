import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5};
    int a = arr1.length;
    int[] arr2 = new int[a];
    for (int i = 0; i < a; i++) {
      arr2[i] = arr1[a - 1 - i];
    }
    for (int i = 0; i < a; i++) {
      arr1[i] = arr2[i];
    }
    for (int i = 0; i < a; i++) {
      System.out.print(arr1[i]);
    }
  }
}
