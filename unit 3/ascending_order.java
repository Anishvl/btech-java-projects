import java.util.Scanner;
public class main{
  public static void main(String[] args)
  {
   int [] unsorted={2,1,3,5,4};
    for(int i=0;i<=4-1;i++)
      {
       for(int j=0;j<=4-i-1;j++)
         {
           if(unsorted[i]>unsorted[i+1])
           {
             int temp=unsorted[i];
             unsorted[i]=unsorted[i+1];
             unsorted[i+1]=temp;
           }
         }
      }
    for(int i=0;i<=4;i++)
      {
        System.out.print(unsorted[i]);
      }
  }
}