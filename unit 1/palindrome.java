import java.util.Scanner;
public class main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n,r,sum=0,t,i;
    System.out.println("enter a number here");
    n=s.nextInt();
    t=n;
    while(n>0)
      {
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
      }
    if(t==sum)
    {
      System.out.println("The above number is a palindrome number");
    }
    else
    {
      System.out.println("It's not a palindrome number");
    }

  }
}