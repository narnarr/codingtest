package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_10872 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int N = Integer.parseInt(br.readLine());
		int factorial = 1;
		
		for (int i=1; i<=N; i++) {
			factorial*=i;
		}
		
		System.out.println(factorial);
	}
}
