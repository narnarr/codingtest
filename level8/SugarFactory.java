package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarFactory {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = {0, 1, 2, 1, 2, 1, 2, 3, 2, 3, 2};
		int f = ((N/10)*10)/5;
		
		if (N==4||N==7) {
			System.out.println(-1);
		} else {
			System.out.println(arr[N%10]+f);
		}
		
	}

}
