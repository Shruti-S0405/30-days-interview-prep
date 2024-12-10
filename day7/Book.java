import java.util.*;

public class Book{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        if(num1%2==0 && num1+1 == num2 || num2%2==0 && num2+1 == num1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}