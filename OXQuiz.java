package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 8958
public class OXQuiz {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int a = 0; a < n; a++) {

			String[] arr = br.readLine().split("");
			int temp = 0;
			int score = 0;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals("O")) {
					temp++;
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[j].equals(arr[i])) {
							temp++;
						} else {
							break;
						}
					}
					score += temp;
					temp = 0;
				}
			}
			sb.append(score).append('\n');
		}
		System.out.println(sb);
	}

}
