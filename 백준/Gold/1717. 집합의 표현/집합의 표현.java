import java.io.*;
import java.util.*;

public class Main {
    static int[] parent;

    // Find 연산: x의 대표 원소를 찾습니다.
    public static int find(int x) {
        if (parent[x] == x) {
            return x;
        } else {
            // 경로 압축 최적화
            return parent[x] = find(parent[x]);
        }
    }

    // Union 연산: x와 y가 속한 집합을 합칩니다.
    public static void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);
        if (xRoot != yRoot) {
            parent[yRoot] = xRoot;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 부모 배열 초기화
        parent = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }

        // 연산 처리
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int operation = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (operation == 0) {
                // 합집합 연산
                union(a, b);
            } else if (operation == 1) {
                // 같은 집합에 속해 있는지 확인하는 연산
                if (find(a) == find(b)) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }

        // 결과 출력
        System.out.print(sb.toString());
    }
}
