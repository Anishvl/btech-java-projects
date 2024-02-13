//diagonal matrix finder
import java.util.Scanner;
public class main{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int [][] arr1=new int[3][3];
    //int [][] arr2=new int[3][3];
    //int a=0;
    System.out.println("Enter the first matrix elements ");
for(int i=0;i<3;i++)
  {
    for(int j=0;j<3;j++)
      {
        arr1[i][j]=s.nextInt();
      }
  }
    for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
          {
            System.out.print(arr1[i][j]);
          }
        System.out.print("\n");
      }
    System.out.println("The trace of a matix is:");
    for(int i=0,a=0;i<3;i++,a++)
      {
      //int a=0;
        for(int j=0;j<3;j++)
          {

            if(a==j)
            {
              System.out.print(arr1[i][j]);

            }

          }
      }
  }
}