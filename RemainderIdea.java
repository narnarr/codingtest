package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// 백준 3052
public class Remainder {
	
	public static void main(String[] args) throws IOException {
    // HashSet 이용하면 훨씬 간결해지지만 비선형 구조라서 매번 모든 값을 검사해야 하므로 시간 오래 걸림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i=0; i<10; i++) {
			set.add(Integer.parseInt(br.readLine())%42);
		}
		System.out.println(set.size());
	}
}
