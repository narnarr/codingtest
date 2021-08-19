package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// taxi geometry
public class B3_3053 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		
		double euclid = Math.PI*r*r;
		double taxi = 2*r*r;
		
		System.out.print(euclid+"\n"+taxi);
	}

}
