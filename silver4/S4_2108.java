package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

// statistics
public class S4_2108 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int arithmetic, median, mode=4001, range, cnt=1;
		double sum = 0;
		
		int[] nums = new int[N];
		LinkedList<Integer> count[] = new LinkedList[N+1];
		
		for (int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			sum += nums[i];
			count[i+1] = new LinkedList<Integer>();
		}
		
		arithmetic = (int) Math.round(sum/N);
		
		Arrays.sort(nums);
		median = nums[N/2];
		
		if (N>1) {
			for (int i=0; i<N-1; i++) {
				if (nums[i]==nums[i+1]) {
					cnt++;
					if (i==N-2) count[cnt].add(nums[i]);
				} else {
					if (i==N-2) count[1].add(nums[N-1]);
					count[cnt].add(nums[i]);
					cnt = 1;
				}
			}
			
			for (int i=1; i<N+1; i++) {
				Collections.sort(count[i]);
			}
			
			for (int i=N; i>0; i--) {
				if (!count[i].isEmpty()) {
					if (count[i].size()>1) count[i].poll();
					mode = count[i].peek();
					break;
				}
			}
		} else mode = nums[0];
		
		range = nums[N-1]-nums[0];
		
		sb.append(arithmetic).append('\n').append(median).append('\n')
		.append(mode).append('\n').append(range).append('\n');
		
		System.out.println(sb);
	}
}
