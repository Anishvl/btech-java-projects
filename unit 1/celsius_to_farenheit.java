//celcius to farenheit calculator
import java.util.Scanner;
public class main{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    double cel;
    main m=new main();
    System.out.println("Enter the celsius to calulate");
    cel=s.nextDouble();
    double far=m.far(cel);
    System.out.println("The farenheiet is "+far);
  }
  double far(double cel)
  {
    double sum=((cel*1.8)+32);
    return sum;
  }
}