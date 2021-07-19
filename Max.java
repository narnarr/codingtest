package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 2562
public class Max {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = Integer.MIN_VALUE;
		int cnt = 0;
		int hold = 0;
		
		for (int i=0; i<9; i++) {
			hold++;
			int tmp = Integer.parseInt(br.readLine());
			if (tmp > max) {
				max = tmp;
				cnt += hold;
				hold = 0;
			}
		}
		System.out.println(max);
		System.out.println(cnt);
		
	}

}
