import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        StringBuilder name = new StringBuilder(s.nextLine().toLowerCase().trim());
        System.out.println("Reversed: " + name.reverse().toString());
        s.close();
        //String name = s.nextLine().toLowerCase();
        //StringBuilder rev = new StringBuilder();
        // for(int i = name.length() - 1; i > -1; i--) {
        //     rev.append(name.charAt(i));
        // }
    }
}
