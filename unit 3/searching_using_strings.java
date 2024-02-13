//Program to count the number of occurrences of a search string in a given text string
import java.util.*;
public class main{
  public static void main(String [] args){
    String str;
    Scanner s=new Scanner(System.in);
    System.out.println("enter the string here");
    str=s.nextLine();
    System.out.println("enter the word here to search");
    String word=s.nextLine();
int a=str.indexOf(word);
    int count = 0;
  while(a != -1)
    {
      count++;
      a=str.indexOf(word,a+1);
    }
    System.out.println(count);

  }
}