//kilo to miles
import java.util.Scanner;
public class main{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    main m=new main();
  double kilo,sum;
    System.out.println("enter the kilometers here");
    kilo=s.nextDouble();
    sum=kilo/1.609344;
    System.out.println(kilo+"are the kilometers and "+sum+" are the miles");
  }
}