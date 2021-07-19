package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 4344
public class AverageExceedRate {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int[] scores = new int[N];
			double sum=0;
			
			for (int j = 0; j < N; j++) {
				scores[j] = Integer.parseInt(st.nextToken());
				sum+=scores[j];
			}
			
			double avg = sum/N;
			double cnt=0;
			
			for (int s: scores) {
				if (s>avg) cnt++;
			}
			
			double rate = cnt/N*100;
			sb.append(String.format("%.3f", rate)).append("%").append('\n');
		}
		System.out.println(sb);
	}

}
