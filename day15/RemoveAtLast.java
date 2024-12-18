import java.io.*;
import java.util.*;

public class RemoveAtLast {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        arr[size-1] += 1;
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}