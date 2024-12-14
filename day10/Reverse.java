import java.io.*;
import java.util.*;

public class Reverse {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        for(int i=str.length-1; i>=0 ;i--){
            System.out.print(str[i]+" ");
        }
    }
}