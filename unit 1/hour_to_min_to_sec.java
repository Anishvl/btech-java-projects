//fibanasci number
import java.util.Scanner;
public class main{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    main m=new main();
    int hou,min,sec;
    System.out.println("enter the hours to convert");
    hou=s.nextInt();
    min=(hou*60);
    sec=min*60;
    int mili=sec*60;
    System.out.println(hou+" hour "+min+" minutes " + sec + " seconds"+mili+" milli seconds");

  }
}