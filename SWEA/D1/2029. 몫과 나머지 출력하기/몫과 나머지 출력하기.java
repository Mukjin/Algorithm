import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{	
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int num[] = new int[2];
		for(int t=1; t<=T; t++)
		{
			for(int i=0; i<num.length; i++)
			{
				num[i] = sc.nextInt();
			}
			
			System.out.printf("#%d %d %d\n",t,num[0]/num[1],num[0]%num[1]);
		}
	}
}