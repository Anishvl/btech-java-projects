import java.util.*;
public class main{
  public static void main(String [] args){
    String str=new String();
    Scanner s=new Scanner(System.in);
    System.out.println("enter the string here");
    str=s.nextLine();
    String a=new String();
    StringBuilder reversed = new       
    StringBuilder(str).reverse();
    System.out.println(reversed);

}
}