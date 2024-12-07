import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



public class birthdaycandles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
        // int max = 0;
        // for(int candle : candles){
        //     if(candle>max){
        //         max = candle;
        //     }
        // }
        // // System.err.println(max);
        // // return max;
        // int count = 0;
        // for(int candle : candles){
        //     if(candle==max){
        //         count += 1;
        //     }
        // }
        // return count;

        // or

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : candles){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return map.get(Collections.max(map.keySet()));
    }
}