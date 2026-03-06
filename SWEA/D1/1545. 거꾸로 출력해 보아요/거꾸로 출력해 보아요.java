import java.io.*;
import java.util.*;

class Solution {
    static BufferedWriter bw;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        recursion(N);
        bw.flush();
        bw.close();
    }

    public static void recursion(int N) throws IOException {
        bw.write(N + " ");
        if (N == 0) {
            return;
        }
        recursion(N - 1);
    }
}