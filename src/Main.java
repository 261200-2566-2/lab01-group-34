import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void insertionsort(int[] arr){ //from geeksforgeeks.orgasdasd
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        while(size <= 0){
            System.out.println("The size of array must greater than '0'");
            size = s.nextInt();
        }
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        insertionsort(arr);
        System.out.println(Arrays.toString(arr)); //from geeksforgeeks.org
    }
}