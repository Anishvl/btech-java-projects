import java.util.*;

public class Main {
    public static void main(String args[]) {
        int arr[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int tar = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to search:");
        tar = s.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == tar) {
                    System.out.println("Got the value " + tar + " at (" + (i + 1) + "," + (j + 1) + ")");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}
