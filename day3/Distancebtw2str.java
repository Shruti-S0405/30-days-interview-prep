import java.util.*;

public class Distancebtw2str {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        String res = sc.nextLine();
        String[] str = res.split(" ");
        
        String start = sc.next();
        String end = sc.next();
        
        int start_index = Arrays.asList(str).indexOf(start);
        int end_index = Arrays.asList(str).indexOf(end);
        
        System.out.print(Math.abs(start_index - end_index));
        
        
    }
}


// import java.io.*;
// import java.util.*;

// public class Solution {

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc = new Scanner(System.in);
        
//         int len = sc.nextInt();
//         sc.nextLine();
//         String str = sc.nextLine();
//         String start = sc.next();
//         String end = sc.next();
        
//         int start_index = -1;
//         int end_index = -1;
        
//         String[] res = str.split(" ");
        
//         for(int i=0; i<len; i++){
//             if(res[i].equals(start)){
//                 start_index = i;
//             }
//             if(res[i].equals(end)){
//                 end_index = i;
//             }            
//         }
        
//         System.out.println(Math.abs(start_index - end_index));
//     }
// }