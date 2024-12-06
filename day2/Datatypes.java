import java.util.*;

public class Datatypes{	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        int int_num = scan.nextInt();
        double double_num = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();
        // System.out.println(str);
        
        System.out.println(i+int_num);
        System.out.println(d+double_num);
        System.out.println(s+str);
        

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}