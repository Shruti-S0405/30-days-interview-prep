import java.io.*;
import java.util.*;

public class Review {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] str = new String[num];
        for(int i=0; i<num; i++){
            str[i] = sc.next();
        }
        for(int i=0; i<num; i++){
            String sc1 = "";
            String sc2 = "";
            for(int j=0; j<str[i].length(); j++){
                if(j%2==0){
                    sc1 = sc1 + str[i].charAt(j);
                }
                else{
                    sc2 = sc2 + str[i].charAt(j);
                }
            }
            System.out.println(sc1+ " " + sc2);
        }
        sc.close();
    }
}
