import java.io.*;
import java.util.*;

public class Habit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int total = sc.nextInt();
        int[] arr = new int[total];
        int max = 0;
        int count = 0;
        int index = 0;
        for(int i = 0; i < total; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < total; i++){
            if(arr[i] == 1){
                count++;
                if(max <= count){
                    max = count;
                    index = i;
                }
            }else{
                count = 0;
            }
        }
        // System.out.println(max);
        // System.out.println(index);
        System.out.print(index - max + 1 + start);
    }
}