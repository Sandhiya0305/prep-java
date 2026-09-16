public class MergeTwoStringsAlternatively {

    public static String mergeString(String str1, String str2) {
        int i1 = 1, i2 = 0, l1 = str1.length(), l2 = str2.length();
        String merged = String.valueOf(str1.charAt(0));
        while(i1 < l1 && i2 < l2) {
            if(i2 < i1) {
                merged += str2.charAt(i2);
                i2++;
            }
            else{
                merged += str1.charAt(i1);
                i1++;
            }
        }
        if(i1 < l1) merged += str1.substring(i1, l1);
        else if(i2 < l2) merged += str2.substring(i2, l2);
        return merged;
    }
    public static void main(String[] args) {
        System.out.println(mergeString("abc", "pq"));
    }
}
