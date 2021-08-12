package funfun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 국회의원 선거
public class S5_1417 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		int[] arr = new int[N - 1];
		int buy = 0;

		for (int i = 0; i < N - 1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		if (N == 1) {
			buy = 0;
		} else {
			Arrays.sort(arr);
			
			while (D <= arr[arr.length-1]) {
				D++;
				arr[arr.length-1]--;
				buy++;
				Arrays.sort(arr);
			}
		}
		System.out.println(buy);
	}

}
