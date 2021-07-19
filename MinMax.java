package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MinMax {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] numbers = new int[n];
		
		st= new StringTokenizer(br.readLine());
		
		for (int i=0; i<n; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(numbers);
		
		int min = numbers[0];
		int max = numbers[numbers.length-1];
		
		System.out.printf("%d %d", min, max);
	}

}
