package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 2675
public class StringRepeater {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int repeatN = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			for (int j=0; j<repeatN*s.length(); j++) {
				sb.append(s.charAt(j/repeatN));
			}
			sb.append("\n");
		}
		System.out.println(sb);

	}

}
