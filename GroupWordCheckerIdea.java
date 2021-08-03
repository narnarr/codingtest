package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

// 백준 1316
public class GroupWordChecker {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i=0; i<n; i++) {
			HashSet<Character> hs = new HashSet<Character>();
			String s = br.readLine();
			char temp = s.charAt(0);
			int j;
			
			for (j=0; j<s.length(); j++) {
				if (hs.add(s.charAt(j))) {
					temp = s.charAt(j);
				} else {
					if (temp == s.charAt(j)) continue;
					else break;
				}
			}
			if (j==s.length()) cnt++;
		}
		System.out.println(cnt);
	}
}
