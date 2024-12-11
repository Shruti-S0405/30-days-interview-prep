import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    double zero = 0;
    double minus = 0;
    double plus = 0;
    for(int a : arr){
        if(a<0){
            minus++;
        }
        if(a>0){
            plus++;
        }
        if(a==0){
            zero++;
        }
    }
    plus = plus/arr.size();
    minus = minus/arr.size();
    zero = zero/arr.size();
    System.out.format("%.6f",plus);
    System.out.println();
    System.out.format("%.6f",minus);
    System.out.println();
    System.out.format("%.6f",zero);
    }
}

public class MinusPlus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
