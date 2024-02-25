import java.util.*;

public class Main {
    public static void main(String args[]) {
        String arr[] = {"browser_history", "visit", "visit", "back",};
        String arr1[][] = {{"leetcode.com"}, {"google.com"}, {"1"}};
        String arr2[] = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("browser_history")) {
                continue;
            } else if (arr[i].equals("visit")) {
                arr2[i] = arr1[i - 1][0];
              System.out.println("Visit to "+arr1[i-1][0]);
            } else if (arr[i].equals("back")) {
              int num = Integer.parseInt(arr1[i - 1][0]);
                arr2[i] = "back to " + arr2[i - num-1];
               System.out.println("Back to "+arr2[i-num-1]);
              arr2[i - num-1]=null;
            } else {
                System.out.println("wrong");
            }
        }
    }
}