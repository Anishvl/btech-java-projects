//Program to input 5 numbers from keyboard and find their sum and average
import java.util.Scanner;
public class Main{
  public static void main(String[] args)
  {
    int a,b,c,d,e,total,avg;
    System.out.println("Enter the 5 numbers to find the sum and avg");
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    d=s.nextInt();
    e=s.nextInt();
    total=a+b+c+d+e;
    avg=(total/5);
    System.out.println("The sum is "+total);
    System.out.println("The avg is "+avg);
  }
}