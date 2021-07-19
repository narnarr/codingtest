package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 15596
public class NPlus {
	
	static long sum(int[] a) {
		long ans=0;
		
		for (int num: a) {
			ans+=num;
		}
		return ans;
	}
  
  // 제출시 main 메서드는 생략
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int n = temp.length;
		int[] numbers = new int[n];
		
		for (int i=0; i<n; i++) {
			numbers[i] = Integer.parseInt(temp[i]);
		}
		
		sum(numbers);
		
	}
}
