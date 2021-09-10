package silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// palindrome
public class S1_17609 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		while (N-- > 0) {
			String s = br.readLine();
			sb.append(check(s)).append('\n');
		}
		System.out.println(sb);
	}
	
	public static int check(String s) {
		int start = 0;
		int end = s.length()-1;
		
		while (start <= end) {
			if (s.charAt(start) == s.charAt(end)) {
				start++;
				end--;
			} else {
				if (!isPseudo(s, start+1, end) && !isPseudo(s, start, end-1)) {
					return 2;
				} else {
					return 1;
				}
			}
		}
		return 0;
	}
	
	public static boolean isPseudo(String s, int start, int end) {
		while (start <= end) {
			if (s.charAt(start) == s.charAt(end)) {
				start++;
				end--;
			} else return false;
		}
		return true;
	}

}
