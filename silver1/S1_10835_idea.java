package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// card game
public class S1_10835 {
	
	static int N, A[], B[], points[][];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		A = new int[N]; // left
		B = new int[N]; // right
		points = new int[N][N];
		
		// fill points[][] with -1 as a mark of 'not calculated'
		for (int i=0; i<N; i++) {
			Arrays.fill(points[i], -1);
		}
		// fill out A[]
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		// fill out B[]
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		// start calculating from the beginning(0,0)
		System.out.println(calcPoint(0,0));
	}
	
	public static int calcPoint(int lcount, int rcount) {
		// end game if either of the pile runs out
		if (lcount==N || rcount==N) 
			return 0;
		
		// dynamic programming: no need to re-calculate
		if (points[lcount][rcount] != -1) 
			return points[lcount][rcount];
		
		// discard left or both and earn zero points
		points[lcount][rcount] = Math.max(calcPoint(lcount+1, rcount), calcPoint(lcount+1,rcount+1));
		
		// if left > right, discard right and earn points
		if (A[lcount] > B[rcount])
			points[lcount][rcount] = Math.max(calcPoint(lcount, rcount), calcPoint(lcount, rcount+1)+B[rcount]);

		return points[lcount][rcount];
	}
}
