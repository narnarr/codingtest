package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 2839 - for문을 수백번 도는 것이 크기 10의 배열에서 한번 읽어오는 것보다 빠르다!?!?
public class SugarFactory {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt=0;
		
		while (N>0) {
			if (N%5==0) {
				N-=5;
				cnt++;
			} else {
				N-=3;
				cnt++;
			}
			if (N<0) {
				cnt = -1;
			}
		}
		System.out.println(cnt);
	}

}
