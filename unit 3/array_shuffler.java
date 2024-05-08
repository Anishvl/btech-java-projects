public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int arr1[] = new int[arr.length];


        for (int i = 0; i < arr.length - 1; i += 2) {
            arr1[i] = arr[i + 1];
            arr1[i + 1] = arr[i];
        }


       if (arr.length % 2 != 0) {
         arr1[arr.length - 1] = arr[arr.length - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
