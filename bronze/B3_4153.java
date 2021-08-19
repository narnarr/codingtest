package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// right triangle
public class B3_4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int[] lens = new int[3];
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			lens[0] = Integer.parseInt(st.nextToken());
			lens[1] = Integer.parseInt(st.nextToken());
			lens[2] = Integer.parseInt(st.nextToken());
			
			if (lens[0]==0) break;
			
			Arrays.sort(lens);
			
			if (lens[0]*lens[0]+lens[1]*lens[1] == lens[2]*lens[2]) {
				sb.append("right").append('\n');
			} else sb.append("wrong").append('\n');
		}
		System.out.println(sb);
	}
}
