package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// finding prime number
public class S4_1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		boolean isPrime = true;
		
		for (int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if (num == 1) continue;

			for (int j=2; j<num; j++) {
				if (num%j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) cnt++;
			isPrime = true;
		}
		System.out.println(cnt);
	}
}
