import java.util.*;

public class Runnerup {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        // HashSet<Integer> map = new HashSet<>();
        // for(int i=0; i<input; i++){
        //     map.add(sc.nextInt());
        // }
        
        // List<Integer> li = new ArrayList<>(map);
        // Collections.sort(li, Collections.reverseOrder());
        
        // System.out.println(li.get(1));

        //or
        int[] scores = new int[input];
        for(int i=0; i<input; i++){
            scores[i] = sc.nextInt();
        }
        int winner = 0;
        for(int score : scores){
            if(score>winner){
                winner = score;
            }
        }
        int runner = 0;
        for(int score: scores){
            if(score>runner && score<winner){
                runner = score;
            }
        }

        System.out.println(runner);
    }
}