
import java.util.ArrayList;
import java.util.List;


public class TwoSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(2, 7, 11, 15));
        int target = 9, flag = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = target - arr.get(i);
            if(arr.contains(num) && arr.indexOf(num) != i) {
                System.out.println(i + " " + arr.indexOf(num));
                flag = 1;
                break;
            }
        }
        if(flag != 1) System.out.println(-1);
    }
}

