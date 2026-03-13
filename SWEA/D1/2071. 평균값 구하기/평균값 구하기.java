import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i <= T; i++) {
		    float sum = 0;
		    for(int j = 0; j < 10; j++) {
		        int num = sc.nextInt();
		        sum += num;
		    }
		    System.out.println("#" + i + " " + Math.round(sum/10));
		}
	}
}