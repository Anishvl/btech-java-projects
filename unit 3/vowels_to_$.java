import java.util.Scanner;
public class main{
  public static void main(String[] args)
  {
   String a;
    int x;
    Scanner s=new Scanner(System.in);
    System.out.println("enter a word to find the vowels");
    a=s.nextLine();
    int size=a.length();
    char arr[]=new char[size];
    //System.out.println(size);
    for(int i=0;i<size;i++)
      {
        if((a.charAt(i)=='a')||(a.charAt(i)=='e')||(a.charAt(i)=='i')||(a.charAt(i)=='o')||(a.charAt(i)=='u'))
        {
        arr[i]='$';
        }
        else{
          arr[i]=a.charAt(i);
        }
      }
    for(int i=0;i<size;i++){
      System.out.print(arr[i]);
    }
  }
}