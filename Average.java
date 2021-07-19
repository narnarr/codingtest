package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 백준 1546
public class Average {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double[] arr = new double[n];
		double total=0, average;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<n; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
			total+=arr[i];
		}
		Arrays.sort(arr);
		average = ((total/arr[n-1])*100)/n;
		System.out.println(average);
		
	}

}
