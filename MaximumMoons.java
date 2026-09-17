import java.util.Scanner;

public class MaximumMoons {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Suns: ");
        int n = s.nextInt();
        s.nextLine();
        System.out.print("Planets: ");
        int m = s.nextInt();
        s.nextLine();
        int max = 0;
        int[][] solar = new int[n][m];
        for(int i = 0; i < n; i++) {
            int rowSum = 0;
            for(int j = 0; j < m; j++) {
                solar[i][j] = s.nextInt();
                rowSum += solar[i][j];
            }
            max = (rowSum < max) ? max : rowSum;
            s.nextLine();
        }
        System.out.println("Maximum number of moons: " + max);
        s.close();
    }
}