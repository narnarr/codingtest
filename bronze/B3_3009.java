package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 4th coordinate
public class B3_3009 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] x = new int[3];
		int[] y = new int[3];
		int ansx=0, ansy=0;
		
		for (int i=0; i<3; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(x);
		Arrays.sort(y);

		if (x[0]!=x[1] && x[1]==x[2]) {
			ansx = x[0];
		} else if (x[0]==x[1] && x[1]!=x[2]) {
			ansx = x[2];
		}
		
		if (y[0]!=y[1] && y[1]==y[2]) {
			ansy = y[0];
		} else if (y[0]==y[1] && y[1]!=y[2]) {
			ansy = y[2];
		}
		
		System.out.println(ansx+" "+ansy);
	}

}
