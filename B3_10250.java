package level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ACMHotel
public class B3_10250 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken()); // 층 수
			int W = Integer.parseInt(st.nextToken()); // 방 수
			int N = Integer.parseInt(st.nextToken()); // 손님 번호

			int room = 0, floor = 0;
			
			if (N%H == 0) {
				room = N/H;
				floor = H;
			} else {
				room = N/H+1;
				floor = N%H;
			}
			sb.append(floor*100+room).append('\n');
		}
		System.out.println(sb);
	}

}
