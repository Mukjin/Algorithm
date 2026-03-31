import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int[][] arr = new int[9][9];
            for (int i = 0; i < 9; i++)
                for (int j = 0; j < 9; j++)
                    arr[i][j] = sc.nextInt();
                    
            int ans = 1;
            for (int i = 0; i < 9; i++) {
                int[] row = new int[10];
                int[] col = new int[10];
                for (int j = 0; j < 9; j++) {
                    if (++row[arr[i][j]] > 1) ans = 0;
                    if (++col[arr[j][i]] > 1) ans = 0;
                }
            }
            
            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 9; j += 3) {
                    int[] grid = new int[10];
                    for (int r = 0; r < 3; r++) {
                        for (int c = 0; c < 3; c++) {
                            if (++grid[arr[i+r][j+c]] > 1) ans = 0;
                        }
                    }
                }
            }
            System.out.println("#" + t + " " + ans);
        }
        sc.close();
    }
}