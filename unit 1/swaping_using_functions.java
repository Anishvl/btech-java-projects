import java.util.Scanner;
public class main{
  public static void main(String[] args){
    main m=new main();
    Scanner s=new Scanner(System.in);
    int a,b;
    System.out.println("Enter two numbers to swap");
    a=s.nextInt();
    b=s.nextInt();
    int[] result =m.swap(a, b);
    System.out.println(result[0]+" and "+result[1]);
  }
  int[] swap(int a,int b)
    {
    int temp=a;
    a=b;
    b=temp;
    int swapped[]={a,b};
    return swapped;
    }

  }