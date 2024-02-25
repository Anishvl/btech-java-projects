//Java Program to find the largest and smallest letter in a string
import java.util.*;
public class main{
  public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the text here");
    String str=s.nextLine();
    char str2 = str.charAt(0); 
    char str3 = str.charAt(0);
    for(int i=0;i<str.length()-1;i++)
      {
        char str1=str.charAt(i);
        if((int)str1<(int)str.charAt(i+1))
        {
          str2=str.charAt(i+1);
        }
      }
    for(int i=0;i<str.length()-1;i++)
      {
        char str1=str.charAt(i);
        if((int)str3>(int)str.charAt(i+1))
        {
          if((int)str2>(int)str1)
          {
            str3=str.charAt(i+1);
          }
        }
      }
    System.out.println("Highest letter is "+str2);
    System.out.println("Smallest letter is "+str3);
  }
}