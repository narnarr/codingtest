package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 10951
public class ABPlus4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input; // input을 선언해야 while문 들어갈 때 br.readLine()이 true가 된다
		StringBuilder sb = new StringBuilder(); // StringBuilder를 사용해서 마지막에 한번에 출력하는 것이 시간 단축된다
		
		while ((input = br.readLine()) != null) {
			st = new StringTokenizer(input);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(a+b).append('\n');
		}
		System.out.println(sb);
	}
}
