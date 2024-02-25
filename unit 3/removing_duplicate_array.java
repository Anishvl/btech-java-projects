import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] arr1 = new int[4];

    System.out.println("Enter the array elements: ");
    for (int j = 0; j < 4; j++) {
      arr1[j] = s.nextInt();
    }

    System.out.println("Before removing duplicates: ");
    for(int j = 0; j < 4; j++) {
      System.out.println(arr1[j]);
    }

    System.out.println("After removing duplicates: ");
    int n = removeDuplicates(arr1);
    for(int i = 0; i < n; i++) {
      System.out.println(arr1[i]);
    }
  }

  public static int removeDuplicates(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] == arr[j]) {
          
          for (int k = j; k < n - 1; k++) {
            arr[k] = arr[k + 1];
          }
          n--;
          j--;
        }
      }
    }
    return n;
  }
}
