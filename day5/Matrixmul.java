import java.util.*;

public class Matrixmul{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =  new Scanner(System.in);
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int m2 = sc.nextInt();
        int n2 = sc.nextInt(); 
        if(n1==m2){
            System.out.println("Yes");
        }else{
          System.out.println("No");
        }
    }
}