package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// hide and seek - using dynamic porgramming
public class S1_1697 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); // current
		int K = Integer.parseInt(st.nextToken()); // destination

		System.out.println(calc(N, K));
	}

	public static int calc(int N, int K) {
		
		int dp[] = new int[K+1];
		
		if (N>K) return N-K;
		else if (N==K) return 0;
		else {
            for (int i = N - 1; i >= 0; i--) {
                dp[i] = dp[i + 1] + 1;
            }

            for (int i = N + 1; i < K + 1; i++) {
                if (i % 2 == 0)
                    dp[i] = Math.min(dp[i - 1], dp[i / 2]) + 1;
                else
                    dp[i] = Math.min(dp[i - 1], dp[(i + 1) / 2] + 1) + 1;
		
            }
		}
		return dp[K];
	}
}
