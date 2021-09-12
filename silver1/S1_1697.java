package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// hide and seek
public class S1_1697 {

	static int[] time = new int[100001];

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); // current location
		int K = Integer.parseInt(st.nextToken()); // destination

		System.out.println(bfs(N, K));
	}

	public static int bfs(int N, int K) {

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(N);
		time[N] = 1;

		while (!queue.isEmpty()) {

			int v = queue.poll();
			
			for (int i=0; i<3; i++) {
				int next;
				
				if (i==0) next = v-1;
				else if (i==1) next = v+1;
				else next = 2*v;
				
				if (next>=0 && next<=100000 && time[next]==0) {
					queue.add(next);
					time[next] = time[v]+1;
				}
				
				if (next == K) return time[K]-1;
			}
		}

		return -1;
	}
}
