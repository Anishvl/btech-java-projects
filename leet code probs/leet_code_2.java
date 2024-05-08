import java.util.*;

public class Main {
    public static void main(String args[]) {
        int arr[] = {8, 4, 6, 2, 3};
        int arr1[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                arr1[i] = arr[i];
            } else if (arr[i] % 2 == 0) {
                arr1[i] = arr[i] - arr[i + 1];
              if(arr1[i]<0){
                arr1[i]=arr1[i]*-1;
              }
            } else {
                arr1[i] = arr[i];
            }
        }

        System.out.print("Input prices: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Output prices: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
