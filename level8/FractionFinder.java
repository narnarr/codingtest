package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 1193
public class FractionFinder {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int temp = N, group=0, n=0, d=0;
		
		while (temp>0) {
			group++;
			temp-=group;
		}
		
		if (group%2==0) {
			n=N-group*(group-1)/2;
			d=(group+1)-n;
		} else {
			d=N-group*(group-1)/2;
			n=(group+1)-d;
		}
		System.out.println(n+"/"+d);
	}
}
