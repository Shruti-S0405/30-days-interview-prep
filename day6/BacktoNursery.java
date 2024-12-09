public import java.io.*;
import java.util.*;

public class BacktoNursery {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        for(char i = 'A'; i<=a; i++){
            System.out.println(i);
        }
    }
    
}
