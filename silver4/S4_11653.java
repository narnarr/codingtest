package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// factorization
public class S4_11653 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		if (N==1) System.exit(0);
		
		for (int i=2; i<=N; i++) {
			while (N%i == 0) {
				N=N/i;
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
}
