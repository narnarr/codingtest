package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 백준 10809
public class Alphabet {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[26];
		Arrays.fill(arr, -1);

		String s = br.readLine();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			int a = s.charAt(i) - 'a';
			if (arr[a] == -1) {
				arr[a] = i;
			}
		}
		
		for (int val : arr) {
			sb.append(val).append(" ");
		}
		System.out.println(sb);

	}

}
