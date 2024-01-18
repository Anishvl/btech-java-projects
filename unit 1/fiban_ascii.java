//fibanasci number
import java.util.Scanner;
public class main{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    main m=new main();
    int a,b=1,c,d=0;
    System.out.println("enter the number here");
    c=s.nextInt();
    for(int i=2;i<=c;i++)
      {
        a=b+d;
        System.out.println(a);
        d=b;
        b=a;
      }
  }
}