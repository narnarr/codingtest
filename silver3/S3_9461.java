package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// padovan sequence
public class S3_9461 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		long[] padovan = new long[101];
		padovan[1] = padovan[2] = padovan[3] = 1;
		padovan[4] = padovan[5] = 2;
		
		for (int i=6; i<101; i++) {
			padovan[i] = padovan[i-1]+padovan[i-5];
		}
		
		while (T-- >0) {
			int N = Integer.parseInt(br.readLine());
			sb.append(padovan[N]).append('\n');
		}
		System.out.println(sb);
	}
}
