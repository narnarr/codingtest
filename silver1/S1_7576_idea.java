package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S1_7576 {
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static Queue<DOT> queue = new LinkedList<DOT>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken()); // width
		int N = Integer.parseInt(st.nextToken()); // height
		
		int[][] box = new int[N][M];
		
		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j=0; j<M; j++) {
				// fill box with tomatoes
				box[i][j] = Integer.parseInt(st.nextToken());
				
				// add ripe tomatoes into queue
				if (box[i][j] == 1) queue.add(new DOT(i,j));
			}
		}
		
		System.out.println(bfs(box, M, N));
		
	}
	
	public static int bfs(int[][] box, int M, int N) {
		
		while(!queue.isEmpty()) {
			DOT ripe = queue.poll();
			
			// neighbor tomatoes
			for (int i=0; i<4; i++) {
				int nextX = ripe.x+dx[i];
				int nextY = ripe.y+dy[i];
				
				// if DOT is out of range, don't add to queue
				if (nextX<0 || nextY<0 || nextX>=N || nextY>=M) continue;
				
				// if neighbor is already ripe or empty, don't add to queue
				if (box[nextX][nextY] != 0) continue;
				
				// neighbor will ripen the next day
				box[nextX][nextY] = box[ripe.x][ripe.y]+1;
				queue.add(new DOT(nextX, nextY));
			}
		}
		int minDay = 0;
		
		for (int i=0; i<N; i++) {
			for (int j=0; j<M; j++) {
				if (box[i][j] == 0) return -1;
				
				minDay = Math.max(minDay, box[i][j]);
			}
		}
		return minDay-1;
	}
}

class DOT {
	int x, y;
	
	public DOT(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
