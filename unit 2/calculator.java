import java.util.Scanner;
public class main{
  public static void main(String[] args){
   Scanner s=new Scanner(System.in);
    main m=new main();
    double a,b;
    System.out.println("enter the first number here");
    a=s.nextDouble();
    System.out.println("Enter the second number here");
    b=s.nextDouble();
   double ad= m.add(a,b);
    double su=m.sub(a,b);
    double multi=m.multiply(a,b);
    double div=m.divide(a,b);
    double mod=m.module(a,b);
  System.out.println(ad);
  System.out.println(su);
  System.out.println(multi);
  System.out.println(div);
    System.out.println(mod);


  }
  Double add(double a,double b)
  {
    double result=a+b;
    return result;
  }
  Double sub(double a,double b)
  {
    double result=a-b;
    return result;
  }
  Double multiply(double a,double b)
  {
    double result=a*b;
    return result;
  }
  Double divide(double a,double b)
  {
    double result=a+b;
    return result;
  }
  Double module(double a,double b)
  {
    double result=a%b;
    return result;
  }
}