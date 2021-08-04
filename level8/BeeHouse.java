package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeeHouse {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 1;
		int range = 1;
		
		while (N > range) {
			range += cnt*6;
			cnt++;
		}
		System.out.println(cnt);
	}

}
