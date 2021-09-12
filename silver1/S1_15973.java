package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// two boxes
public class S1_15973 {
	static int[] d1 = new int[4];
	static int[] d2 = new int[4];

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<4; i++) {
			d1[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<4; i++) {
			d2[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(check());
	}
	
	public static String check() {
		
		if ((d1[0]==d2[2] || d1[2]==d2[0]) && (d1[1]==d2[3] || d1[3]==d2[1])) {
			return "POINT";
		} else if ((d1[0]==d2[2] || d1[2]==d2[0]) && (d1[1]<d2[3] && d1[3]>d2[1])) {
			return "LINE";
		} else if ((d1[1]==d2[3] || d1[3]==d2[1]) && (d1[0]<d2[2] && d1[2]>d1[0])) {
			return "LINE";
		} else if (d1[0]>d2[2] || d1[2]<d2[0] || d1[1]>d2[3] || d1[3]<d2[1]) {
			return "NULL";
		} else {
			return "FACE";
		}
	}
}
