//area of a triangle
import java.util.Scanner;
public class main{
  public static void main(String[] args)
  {
    double b,h;
    Scanner s=new Scanner(System.in);
    main m=new main();
    System.out.println("enter the base here");
    b=s.nextDouble();
    System.out.println("enter the height here");
    h=s.nextDouble();
    double area=m.area(b,h);
    System.out.println("The area is "+area);
  }
  double area(double b,double h)
  {
    double area=0.5*b*h;
    return area;
  }
}