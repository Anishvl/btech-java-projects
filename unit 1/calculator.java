import java.util.Scanner;
public class main{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int a,b;
    char x;
    System.out.println("Enter the two numbers here to perform calculations");
    a=s.nextInt();
    b=s.nextInt();
    System.out.println("Enter the calculation ('+','-','/','%','*') symbol:");
    x=s.next().charAt(0);
    if(x=='+')
    {
      int c=a+b;
      System.out.println(a+"+"+b+"="+c);
    }
    else if(x=='-')
    {
      int c=a-b;
      System.out.println(a+"-"+b+"="+c);
    }
    else if(x=='*')
    {
      int c=a*b;
      System.out.println(a+"*"+b+"="+c);
    }
    else if(x=='/')
    {
      int c=a/b;
      System.out.println(a+"/"+b+"="+c);
    }
    else if(x=='%')
    {
      int c=a%b;
      System.out.println(a+"%"+b+"="+c);
    }
    else
    {
      System.out.println("The entered expression is invalid");
    }
  }
}