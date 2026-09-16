public class LongestWordinString {
    public static void findLongestWord(String[] words) {
        int max = 0;
        for(String word: words) {
            if(word.length() > max) max = word.length();
        }
        for(String word: words) {
            if(word.length() ==  max) System.out.println(word);
        }
        if(max == 0) System.out.println("String is empty");
    }
    public static void main(String[] args) {
        String sentence = "I love Java programming.".trim();
        String cleaned = sentence.replaceAll("[^a-zA-Z0-9]", " ");
        findLongestWord(cleaned.split("\\s+"));
    }
}
