//Program in Java to display the multiplication table of a given integer.
import java.util.Scanner;
public class Main
  {
  public static void main(String[] args)
    {
    int a;
    int max=1000;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number to display the table");
    a=s.nextInt();
    for(int i=0;i<=max;i++)
      {
        System.out.println(a+"x"+i+"="+i*a);
      }
    }
  }