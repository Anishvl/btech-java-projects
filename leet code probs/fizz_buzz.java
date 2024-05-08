/*
  Write a program that prints the numbers from 1 to n. But for multiples of three, print "Fizz" instead of the number, and for the multiples of five, print "Buzz". For numbers that are multiples of both three and five, print "FizzBuzz".
  */
import java.util.*;
public class main{
  public static void main(String[] args)
  {
    int n,a;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number here");
    a=s.nextInt();
    for(int i=1;i<=a;i++)
      {
        n=i;
        if(n%3==0 && n%5==0)
        {
          System.out.println("FizzBuzz");
        }
        else if(n%5==0)
        {
          System.out.println("Buzz");
        }
        else if(n%3==0)
        {
          System.out.println("Fizz");
        }
        else
        {
          System.out.println(n);
        }
      }
  }
}