import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Integer>> link;
	public static int[][] dp = new int[300001][2];
	public static void main(String[] args) {
		int a = solution(new int[]{14, 17, 15, 18, 19, 14, 13, 16, 28, 17}, 
				new int[][]{{10, 8}, {1, 9}, {9, 7}, {5, 4}, {1, 5}, {5, 10}, {10, 6}, {1, 3}, {10, 2}}
				);
	
		System.out.println(a);
	}
	
	public static int solution(int[] sales, int[][] links) {
		link = new ArrayList<>();
		
		for(int i=0;i<sales.length+1;i++) {
			link.add(new ArrayList<>());
		}
		
		for(int i=0;i<links.length;i++) {
			int a = links[i][0];
			int b = links[i][1];
			link.get(a).add(b);
		}
		
		dfs(sales, 1);
		int answer = Math.min(dp[1][0], dp[1][1]);
		return answer;
	}
	
	public static void dfs(int[] sales, int idx) {
		dp[idx][0] = 0;
		dp[idx][1] = sales[idx-1];
		
		if(link.get(idx).size() == 0) return;
		int extra = (int)1e9;
		for(int child:link.get(idx)) {
			dfs(sales, child);
			
			if(dp[child][0] < dp[child][1]) {
				dp[idx][0] += dp[child][0];
				dp[idx][1] += dp[child][0];
				
				extra = Math.min(extra, dp[child][1] - dp[child][0]);
			} else {
				
				dp[idx][0] += dp[child][1];
				dp[idx][1] += dp[child][1];
				
				extra = 0;
			}
		}
		
		dp[idx][0] += extra;
		return;
	}

}