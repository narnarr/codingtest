package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Fibonacci
public class B2_10870 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n) {
		if (n<=1) return n;
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
