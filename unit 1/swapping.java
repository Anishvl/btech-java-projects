//swapping
import java.util.Scanner;
public class main
  {
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
      int a,b,temp;
      System.out.println("enter two numbers to swap");
      a=s.nextInt();
      b=s.nextInt();
      System.out.println("Before swapping a="+a+" and b="+b);
      temp=a;
      a=b;
      b=temp;
      System.out.println("After swapping a= "+a+" and b= "+b);
    }
  }