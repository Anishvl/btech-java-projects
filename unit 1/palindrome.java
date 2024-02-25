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



/*
["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
[["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
Output:
[null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]
*/