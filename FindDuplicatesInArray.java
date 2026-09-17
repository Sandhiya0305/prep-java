import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {

    public static void findDuplicates(int[] arr) {
        Set<Integer> dups = new HashSet<>();
        for(int i: arr) {
            if(!dups.add(i)) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 4};
        findDuplicates(arr);
    }
}
