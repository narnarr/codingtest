package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 3052
public class Remainder {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		
		for (int i=0; i<10; i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;
		}
		
		int cnt = 10;
		
		for (int i=0; i<10; i++) {
			for (int j=i+1; j<10; j++) {
				if (arr[i]==arr[j]) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
