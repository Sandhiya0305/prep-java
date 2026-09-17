import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args) {
        char[] word = "Sandhiya".toCharArray();
        Map<Character, Integer> freq = new HashMap<>();
        for(char w: word) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }
        System.out.println(freq);
    }
}
