package level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 2869
public class SnailCalculator {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double A = Integer.parseInt(st.nextToken());
		double B = Integer.parseInt(st.nextToken());
		double V = Integer.parseInt(st.nextToken());
		
		double day = Math.ceil((V-B)/(A-B));
		
		System.out.println((int) day);
	}

}
