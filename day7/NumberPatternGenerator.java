import java.util.*;

public class NumberPatternGenerator {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=0; i<num; i++){
            if(i!=0){
                System.out.print(i);                
                System.out.print(i+1);
                System.out.print(i);
                System.out.println();
            }
            else{
                System.out.print(i+1);
                System.out.println();
            }
        }
    }
}