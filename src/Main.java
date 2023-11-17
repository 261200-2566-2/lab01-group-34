import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void sort(int[] arr){
        Arrays.sort(arr); //from geeksforgeeks.org
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
        sort(arr);
        System.out.println(Arrays.toString(arr)); //from geeksforgeeks.org
    }
}