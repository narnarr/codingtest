package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Bertrand's postulate
public class S2_4948 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N, cnt=0;
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			boolean notPrime[] = new boolean[2*N+1];
			
			notPrime[0] = true;
			if (N>1) notPrime[1] = true;
			
			if (N == 0) break;
			
			for (int i=2; i<=Math.sqrt(2*N); i++) {
				if (notPrime[i] == false && i*i<=Integer.MAX_VALUE) {
					for (int j=i*i; j<=2*N; j+=i) {
						notPrime[j] = true;
					}
				}
			}
			
			for (int i=N+1; i<=2*N; i++) {
				if (notPrime[i] == false) cnt++;
			}
			
			sb.append(cnt).append('\n');
			cnt = 0;
		}
		System.out.println(sb);
	}

}
