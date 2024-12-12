import java.io.*;
import java.util.*;

public class FindFreq {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String in = sc.next().toLowerCase();
        char[] c = in.toCharArray();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(int i=0; i<c.length; i++){
            map.put(c[i],map.getOrDefault(c[i],0)+1);
        }
        // System.out.println(map);
        map.forEach((k,v) ->
                    System.out.println(k+":"+v));
    }
}