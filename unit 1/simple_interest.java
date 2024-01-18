//simple interest
import java.util.Scanner;
public class main{
  public static void main(String[] args)
  {
    System.out.println("Simple Interest Calculator");
    Scanner s=new Scanner(System.in);
    int amount,time,interest,total;
    System.out.println("enter the amount here");
    amount=s.nextInt();
    System.out.println("enter the time here");
    time=s.nextInt();
    System.out.println("enter the rate of interest here");
    interest=s.nextInt();
    total=amount*time*interest/100;
    System.out.println("The Simple interest is "+total);
  }
}