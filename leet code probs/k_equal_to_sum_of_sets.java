import java.util.*;
public class main{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number here");
    int a=s.nextInt();
    int arr[]={1,2,3,4,5,6,7,8,9};
    int len=arr.length;

    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-1;j++){
        if(arr[i]+arr[j]==a){
          System.out.println(arr[i]+","+arr[j]);
        }
        else{
          continue;
        }
      }
    }
  }
}