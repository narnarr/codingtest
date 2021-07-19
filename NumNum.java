package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumNum {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mult = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		String[] numbers = String.valueOf(mult).split("");
		int cnt;
		
		for (int i=0; i<10; i++) {
			cnt = 0;
			for (int j=0; j<numbers.length; j++) {
				if (i == Integer.parseInt(numbers[j])) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	}

}
