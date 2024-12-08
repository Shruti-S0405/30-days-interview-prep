import java.io.*;
import java.util.*;

public class Squarepattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String symbol = sc.next();
        
        for(int i=1; i<a+1; i++){
            if(i==1 || i==a){
                System.out.print(symbol.repeat(a));
            }
            else{
                System.out.print(symbol+" ".repeat(a-2)+symbol);
            }
            System.out.println();
        }
    }
}