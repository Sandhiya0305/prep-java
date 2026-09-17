import java.util.Arrays;

public class ReplaceWithGreatestElementToRight {

    public static int[] replaceElements(int[] arr) {
        int maxRight = -1, current;
        for(int i = arr.length - 1; i > -1; i--) {
            current = arr[i];
            arr[i] = maxRight;
            if(current > maxRight) maxRight = current;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
