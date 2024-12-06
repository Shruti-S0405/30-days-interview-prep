import java.io.*;
import java.util.*;

public class SumDivisible {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int i=num1; i<=num2; i++){
            int sum = 0;
            int num = i;
            while(num>0){
                sum = sum+(num%10);
                num = num/10;
            }
            if(sum%3==0){
                System.out.println(i);
            }
        }
    }
}