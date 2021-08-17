package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// finding prime numbers in range
public class S2_1929 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] s = br.readLine().split(" ");
		
		int M = Integer.parseInt(s[0]);
		int N = Integer.parseInt(s[1]);
		
		boolean[] notPrime = new boolean[N+1];
		notPrime[0] = notPrime[1] = true;
		
		for (int i=2; i*i<=N; i++) {
			if (notPrime[i] == false) {
				for (int j=i*i; j<=N; j+=i) {
					notPrime[j] = true;
				}
			}
		}
		
		for (int i=M; i<=N; i++) {
			if (notPrime[i] == false) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}

}
