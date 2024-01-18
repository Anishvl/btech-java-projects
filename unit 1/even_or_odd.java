//even or odd
import java.util.Scanner;
public class main{
  public static void main(String[] args)
  {
    System.out.println("enter a number here to check even or odd");
    Scanner s=new Scanner(System.in);
    int num;
    num=s.nextInt();
    if(num%2==0)
    {
      System.out.println("The given number is a Even number");
    }
    else
    {
      System.out.println("The given number is a Odd number");
    }
  }
}