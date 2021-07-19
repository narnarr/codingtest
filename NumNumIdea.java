package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumNum {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mult = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		
		while (mult !=0) {
			arr[mult%10]++;
			mult = mult/10;
		}
		for (int result: arr) {
			System.out.println(result);
		}
	}
}
