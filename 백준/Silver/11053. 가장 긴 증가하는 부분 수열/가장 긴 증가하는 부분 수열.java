import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        int[] dp = new int[N + 1]; 
 
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
        }
 
        dp[1] = 1;
        int ans = 1;
        for (int i = 2; i <= N; i++) {
            dp[i] = 1;
 
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j] && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                }
            }
            ans = Math.max(ans, dp[i]);
        }
 
        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
 
}
