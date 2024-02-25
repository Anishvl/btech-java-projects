//Java Program to find the largest and smallest letter in a string
import java.util.*;
public class main{
  public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the text here");
    int a;
    a=s.nextInt();
    int[] arr=new int[a];
    System.out.println("Enter the numbers here");
    for(int i=0;i<a;i++)
      {
        int temp=s.nextInt();
        arr[i]=temp;
      }
    int small=arr[0];
    for(int i=0;i<a;i++)
      {
        if(arr[i]<small)
        {
          small=arr[i];
        }
      }
    System.out.println("Smallest number is " + small);
    int sec=arr[1];
    for(int i=0;i<a;i++)
      {
        if(arr[i] != small)
       {
         if(arr[i] > small && arr[i] < sec)
         {
           sec=arr[i];
         }
       }
      }
    System.out.println("Second smallest number is "+sec);
    int third=arr[2];
   for(int i=0;i<a;i++)
     {
       if(arr[i]!=small && arr[i]!=sec)
       {
         if(arr[i]>small&&arr[i]>sec&& arr[i]<third)
         {
           third=arr[i];
         }
       }
     }
    System.out.println("Third smallest number is "+third);
    int hig=arr[0];
    for(int i=0;i<a;i++)
      {
        if(hig<arr[i])
        {
          hig=arr[i];
        }
      }
    System.out.println("Highest number is "+hig);
    int sechig=arr[0];
    for(int i=0;i<a;i++)
      {
        if(arr[i]!=hig)
        {
            if(arr[i] > hig && arr[i] > sechig)
          {
            int temp=arr[i];
            sechig=temp;
          }
        }
      }
  }
}