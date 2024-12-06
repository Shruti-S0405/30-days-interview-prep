import java.io.*;
import java.util.*;
import java.util.Map;
import java.lang.*;

public class RemoveDup {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        for(int i=0; i<len; i++){
            int ele = sc.nextInt();
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        // System.out.println(map);
        
        for(int i: map.keySet()){
            if(map.get(i)<2){
                System.out.print(i+" ");
            }
            else{
                System.out.print(i+" "+i+" ");
            }
        }     
    }
}