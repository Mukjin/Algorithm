import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println("#"+(i+1)+" "+(n1==n2?"=":n1<n2?"<":">"));
        }
    }
}
