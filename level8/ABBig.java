package level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ABBig {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String a = st.nextToken();
		String b = st.nextToken();
		
		int len = Math.max(a.length(), b.length())+1;
		int[] arr = new int[len];
		
		for (int i=0; i<a.length(); i++) {
			arr[i] += a.charAt(a.length()-i-1)-'0';
		}
		
		for (int i=0; i<b.length(); i++) {
			arr[i] += b.charAt(b.length()-i-1)-'0';
		}
		
		for (int i=0; i<len; i++) {
			if (arr[i]>9) {
				arr[i+1] += arr[i]/10;
				arr[i] = arr[i]%10;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if (arr[len-1]!=0) sb.append(arr[len-1]);
		
		for (int i=1; i<len; i++) {
			sb.append(arr[len-i-1]);
		}
		
		System.out.println(sb);
	}

}
