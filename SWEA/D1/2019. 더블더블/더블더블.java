import java.io.*;
import java.util.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int idx = 1;
        for (int i = 0; i <= N; i++, idx *= 2) {
            bw.write(idx + " ");
        }
        bw.flush();
        bw.close();
    }
}