import java.util.Scanner;
import java.util.Base64;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            String encodedStr = sc.next();
            
            // 1. Base64 디코딩 (결과는 byte 배열)
            byte[] decodedBytes = Base64.getDecoder().decode(encodedStr);
            
            // 2. byte 배열을 String으로 변환
            String decodedStr = new String(decodedBytes);
            
            System.out.println("#" + t + " " + decodedStr);
        }
        sc.close();
    }
}