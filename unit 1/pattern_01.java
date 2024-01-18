// Program in Java to display the pattern like right angle triangle with a number.
import java.util.Scanner;
public class Main
  {
    public static void main(String[] args)
    {
      System.out.println("Input number of rows: ");
      int rows;
      Scanner s=new Scanner(System.in);
      rows=s.nextInt();
      for(int i=1;i<=rows;i++)
        {
          for(int j=1;j<=i;j++)
            {
              System.out.print(j);
              //System.out.println("\n")
            }
          System.out.print("\n");
        }
    }
  }