import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5};
    int a = arr1.length;
    Scanner s = new Scanner(System.in);
    int b=0;
    for(int i=0;i<a;i++)
      {
        b=b+arr1[i];
      }
     b=b/a;
    System.out.println("The avg in the given array is "+b);

  }
}
