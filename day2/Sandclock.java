import java.io.*;
import java.util.*;
import java.lang.*;

public class Sandclock {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for(int i=1; i<h+1; i++){
            int width = Math.abs((h+1)-(i*2));
            int star = ((h+1) - width)/2;
            System.out.print("*".repeat(star));
            System.out.print(" ".repeat(width));
            System.out.print("*".repeat(star));
            System.out.println();
        }
    }
}