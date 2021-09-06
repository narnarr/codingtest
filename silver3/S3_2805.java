package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// tree cutter
public class S3_2805 {
	
	static int trees[], max;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // number of trees
		int M = Integer.parseInt(st.nextToken()); // target length
		
		trees = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<N; i++) {
			trees[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, trees[i]);
		}
		
		System.out.println(findCutter(N, M));
	}
	
	public static long findCutter(int N, int M) {
		
		long start = Math.max(0, max-M); // faster than 0
		long end = max;
		long mid, sum;
		
		while (start <= end) {
			mid = (start+end)/2;
			sum = 0;
			
			for (int i=0; i<N; i++) {
				if (trees[i] > mid) sum += (trees[i]-mid);
			}
			
			// lengthen the cutter if sum exceeds M
			if (sum >= M) start = mid + 1;
			// shorten the cutter if sum is not enough
			else if (sum < M) end = mid - 1;
		}
		
		return end;
	}
}
