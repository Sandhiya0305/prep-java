public class PalindromeCheck {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("Madam");
        System.out.println((word.reverse() == word)? "YES" : "NO");
    }
}
