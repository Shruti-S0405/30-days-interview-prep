import java.io.*;

public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
class Result {
    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
    public static void staircase(int n) {
    // Write your code here
        for(int i=1; i<n+1; i++){
            int space = n-i;
            int hash = i;
            System.out.print(" ".repeat(space));
            System.out.print("#".repeat(hash));
            System.out.println();
        }
    }

}