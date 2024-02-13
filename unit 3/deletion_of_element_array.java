import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5};
    int a = arr1.length;
    Scanner s = new Scanner(System.in);
    System.out.println("enter the position to delete the element in the array (in index way)");
    int b = s.nextInt();
    for (int i=b;i<a-1;i++) 
    {
      arr1[i]=arr1[i+1];
    }
    a--; 
    System.out.println("Array after deletion:");
    for (int i = 0; i < a; i++) {
      System.out.println(arr1[i]);
    }
  }
}
