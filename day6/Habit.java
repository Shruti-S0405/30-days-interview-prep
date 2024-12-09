import java.io.*;
import java.util.*;

public class Habit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int total = sc.nextInt();
        
        int[] arr = new int[start+total];
        for(int i=start; i<start+total; i++){
            arr[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(arr));
        int count = 0;
        int max = 0;
        int start_index = 0;
        int max_index = 0;
        
        for(int j=start; j<start+total; j++){
            if(arr[j]==1){
                if(count==0){
                    start_index = j;
                }
                count++;
            }else{
                count = 0;
            }
            if(max<count){
                max = count;
                max_index = start_index;
            }
        }
        // System.out.println(max);
        System.out.println(max_index);
    }
}