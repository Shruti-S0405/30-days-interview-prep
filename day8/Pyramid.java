import java.io.*;
import java.util.*;

public class Pyramid {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int prev = 1;
        int power = 0;
        int input = sc.nextInt();
        int current;
        for(int i=input; i>0; i--){
            if(i==input){
                current = 1;
            }
            else{
                current = prev + (int)Math.pow(10,power);
                // System.out.println(current);
            }
            System.out.println(current*i);
            prev = current;
            power++;
        }
    }
}