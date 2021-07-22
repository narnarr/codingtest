package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;

// 백준 1065
public class HanSu {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(calc(num));
	}
	
	static int calc(int number) {
		int cnt=0;
		if (number<100) return number;
		else {
			for (int i=100; i<=number; i++) {
				int a = i/100;
				int b = (i/10)%10;
				int c = i%10;
				if (a-b==b-c) cnt++;
			}
			return 99+cnt;
		}
	}
}
