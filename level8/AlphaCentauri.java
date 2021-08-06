package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlphaCentauri {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int d = y - x;
			int k = (int) Math.floor(Math.sqrt(d));
			int cnt = 2 * k - 1;

			d-=k*k;
			
			while (d>0) {
					d-=k;
					cnt++;
			}

			sb.append(cnt).append('\n');
		}
		System.out.println(sb);
	}
}
