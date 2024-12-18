import java.io.IOException;
import java.util.*;

public class PDF {
    public static void main(String[] args) throws IOException {
        List<Integer> h = new ArrayList<>(Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5));
        String word = "abc";

        List<Character> alphabet = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(char i = 'a'; i <= 'z'; i++){
            alphabet.add(i); 
        }
        for(int i=0; i<word.length(); i++){
            int ind = h.get(alphabet.indexOf(word.charAt(i)));
            res.add(ind);
        }
        int output = Collections.max(res);
        System.out.println(output*word.length());
    }
}




