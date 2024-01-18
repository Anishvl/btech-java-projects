//area of a circle
import java.util.Scanner;
public class main{
  public static void main(String[] args)
  {
    double a;
    main m=new main();
    Scanner s=new Scanner(System.in);
    System.out.println("enter the radius to calculate the area");
    a=s.nextDouble();
    double radi=m.radius(a);
    System.out.println("The radius is "+radi);

  }
  double radius(double a)
  {
    double radi=3.14*a*a;
    return radi;
  }
}