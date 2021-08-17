package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// finding prime number
public class S5_2581 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		boolean[] notPrime = new boolean[10001];
		notPrime[0] = notPrime[1] = true;
		
		int sum = 0, min = -1;
		
		for (int i=2; i*i<=N; i++) {
			if (notPrime[i] == false) {
				for (int j=i*i; j<=N; j+=i) {
					notPrime[j] = true;
				}
			}
		}
		
		for (int i=M; i<=N; i++) {
			if (notPrime[i]==false) {
				if (min == -1) min = i;
				sum+=i;
			}
		}
		
		if (min == -1) {
			System.out.println(min);
		} else {
			sb.append(sum).append('\n').append(min);
			System.out.println(sb);
		}
	}
}
