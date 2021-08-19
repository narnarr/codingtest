package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Goldbach's conjecture
public class S1_9020 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int t=0; t<T; t++) {
			int n = Integer.parseInt(br.readLine());
			int min = 10000;
			
			boolean[] notPrime = new boolean[n+1];
			notPrime[0] = notPrime[1] = true;
			
			for (int i=2; i*i<=n; i++) {
				if (notPrime[i] == false) {
					for (int j=i*i; j<=n; j+=i) {
						notPrime[j] = true;
					}
				}
			}
			
			int[] m = new int[10001];
			
			// i와 n-i 간 차이가 최소인 i를 찾기 위해 Math.min을 사용하기보단
			// notPrime[n/2]부터 검토해나가는 것이 훨씬 빠르다.
			for (int i=2; i<=n; i++) {
				if (notPrime[i] == false && notPrime[n-i] == false) {
					int sub = Math.abs(n-2*i);
					m[sub] = i;
					min = Math.min(min, sub);
				}
			}
			sb.append(n-m[min]).append(" ").append(m[min]).append('\n');
		}
		System.out.println(sb);
	}
}
