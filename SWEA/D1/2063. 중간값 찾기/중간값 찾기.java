import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            nums.add(sc.nextInt());
        }
	Collections.sort(nums);
        System.out.println(nums.get((T-1)/2));
	}
}
