import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static boolean[] visited;
    static int[] result; // 선택한 숫자를 저장하는 배열
    static StringBuilder sb; // 방문 여부 체크

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();

        visited = new boolean[n+1]; // 1~N 사용
        result = new int[m];
        backtrack(0);
        System.out.println(sb);
    }

    static void backtrack(int depth) {
        if (depth == m) { // M개를 선택했다면 출력
            for (int num : result) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {  // 아직 사용되지 않은 숫자라면 선택
                visited[i] = true;  // 방문 체크
                result[depth] = i;  // 선택한 숫자 저장
                backtrack(depth + 1);  // 다음 단계 진행
                visited[i] = false;  // 백트래킹 (원상복구)
            }
        }
    }
}