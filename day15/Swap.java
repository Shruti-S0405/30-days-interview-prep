import java.util.*;

public class Swap {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int temp = a;
    a = b;
    b = temp;
    System.out.println(a);
    System.out.println(b);
    }
}