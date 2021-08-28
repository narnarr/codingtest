package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_1074 {
	
	static int N, r, c, count = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		System.out.println(calc(N));
	}

	public static int calc(int N) {

		int len = (int) Math.pow(2, N);
		
		if (r<len/2 && c>=len/2) {			// 2사분면
			count+=len*len/4;
			c-=len/2;
		} else if (r>=len/2 && c<len/2){	// 3사분면
			count+=len*len/2;
			r-=len/2;
		} else if (r>=len/2 && c>=len/2) {	// 4사분면
			count+=(len*len/4)*3;
			r-=len/2;
			c-=len/2;
		}
		
		if (N==1) return count;
		return calc(N-1);
	}

}
