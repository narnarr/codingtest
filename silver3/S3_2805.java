package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// tree cutter
public class S3_2805 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // num of trees
		int M = Integer.parseInt(st.nextToken()); // target
		int[] trees = new int[N];
		
		int max = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<N; i++) {
			trees[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, trees[i]);
		}
		
		long end = max;
		long start = 0; // faster than 'max - M'
		long sum, mid;
		
		while (start <= end) {
			mid = (start + end) / 2;
			sum = 0;
			
			for (int tree: trees) {
				if (tree > mid) sum += (tree-mid);
			}
			
			// if sum is bigger than target, lengthen the cutter
			if (sum >= M) {
				start = mid +1;
			}
			// if sum is smaller than target, shorten the cutter
			else {
				end = mid - 1;
			}
		}
		
		System.out.println(end);
	}

}
