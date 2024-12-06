import java.io.*;
import java.util.*;

public class targetSum {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(); // To get the length of the array
        int[] arr = new int[len]; // To get the array
        
        for(int i = 0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt(); // To get the target Sum
        
        for(int i=0; i<len-1; i++){
            for(int j=i+1; j<len; j++){
                if(arr[i]+arr[j] == target){
                    System.out.println(i+ " "+ j);
                    return;
                }
            }
        sc.close();
        }
        
        
        
        // Scanner sc = new Scanner(System.in);
        // int len = sc.nextInt();
        // List<Integer> arr = new ArrayList<Integer>();
        // for(int i=0; i<len; i++){
        //     arr.add(sc.nextInt());
        // }
        // int target = sc.nextInt();
        // HashSet<Integer> res = new HashSet<>();
        // for(int j : arr){
        //     int diff = target - j;
        //     int index = arr.indexOf(j);
        //     arr.remove(index);
        //     if(arr.contains(diff)){
        //         res.add(diff);
        //         res.add(j);
        //         System.out.println(res);
        //         break;
        //     }
        //     else{
        //         arr.add(j);
        //     }
        // }
    }
}