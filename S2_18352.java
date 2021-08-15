package funfun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 경쟁적 전염
// 그래프 알고리즘 http://dblab.duksung.ac.kr/ds/pdf/Chap10.pdf
public class S2_18352 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 도시 수
		int M = Integer.parseInt(st.nextToken()); // 도로 수
		int K = Integer.parseInt(st.nextToken()); // 이웃 정보
		int X = Integer.parseInt(st.nextToken()) - 1; // 출발 도시
		
		LinkedList<Integer>[] graph = new LinkedList[N]; // 이웃 리스트
		int[] distance = new int[N]; // 도시별 X와의 최단거리
		
		for (int i=0; i<N; i++) {
			graph[i] = new LinkedList<Integer>();
			distance[i] = -1; // 미방문 도시 거리 -1로 초기화
		}
		
		distance[X] = 0; // 출발도시의 거리는 0
		
		// 이웃 정보 리스트에 저장
		for (int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken()) - 1;
			int v2 = Integer.parseInt(st.nextToken()) - 1;
			
			graph[v1].add(v2);
		}
		
		for (int i=0; i<N; i++) {
			Collections.sort(graph[i]); // 이웃 도시 번호 작은 것부터 방문하도록 정렬
		}
		
		// bfs 너비탐색
		Queue<Integer> queue = new LinkedList<>();
		queue.add(X); // 방문 예정
		
		while (!queue.isEmpty()) {
			int now = queue.poll(); // 도착 후 큐에서 제거
			for (int i=0; i<graph[now].size(); i++) {
				int next = graph[now].get(i);
				
				// 미방문 이웃도시일 경우 큐에 추가 후 거리 1 더하기
				if (distance[next]==-1) {
					queue.add(next);
					distance[next] = distance[now]+1;
				}
			}
		}
		
		boolean hasK = false;
		for (int i=0; i<N; i++) {
			if (distance[i] == K) {
				hasK = true;
				System.out.println(i+1); // 도시는 1번부터, 배열은 0번부터 시작이므로 1 크게 출력
			}
		}
		if (hasK == false) System.out.println(-1); // 최단거리 K 하나도 없을 경우 -1 출력
		
	}
}
