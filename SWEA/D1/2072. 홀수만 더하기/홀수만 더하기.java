import java.util.*;
import java.lang.*;
import java.io.*;
 
class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int num = Integer.parseInt(br.readLine());
 
        for(int i = 1 ; i <= num ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int answer = 0;
 
            for(int j = 0 ; j < 10 ; j++){
                int num2 = Integer.parseInt(st.nextToken());
                if(num2 % 2 == 1)
                    answer += num2;
            }
            System.out.println("#" + i + " " + answer);
        }
         
    }
}