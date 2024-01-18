import java.util.Scanner;
public class main{
  public static void main(String[] args)
  {
   String a;
    int x;
    Scanner s=new Scanner(System.in);
    System.out.println("enter a word to find the vowels");
    a=s.next();
    int size=a.length();
    int j=0;
    //System.out.println(size);
    for(int i=0;i<size;i++)
      {
        if((a.charAt(i)=='a')||(a.charAt(i)=='e')||(a.charAt(i)=='i')||(a.charAt(i)=='o')||(a.charAt(i)=='u'))
        {
         j++; 
        }
      }
    System.out.println("The total number of vowels are "+j);
    int con=size-j;
    System.out.println("The total number of consonants are "+con);
  }
}