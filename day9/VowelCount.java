import java.io.*;
import java.util.*;

public class VowelCount {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        char[] c = in.toLowerCase().toCharArray();
        // System.out.println(Arrays.toString(c));
        HashSet<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int count = 0;
        for(int i=0; i<c.length; i++){
            if(set.contains(c[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}