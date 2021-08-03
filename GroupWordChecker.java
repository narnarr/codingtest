package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 백준 1316
public class GroupWordChecker {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i=0; i<n; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			boolean isGroup = true;
			int c = 0, prev = 0;
			
			String s = br.readLine();
			byte[] arr = s.getBytes();
			
			for (int j=0; j<s.length(); j++) {
				c=s.charAt(j);
				if (c-prev!=0) list.add(c);
				prev = c;
			}
			
			for (int j=0; j<list.size(); j++) {
				if (list.lastIndexOf(list.get(j))!=j) isGroup = false;
			}
			if (isGroup == true) cnt++;
		}
		System.out.println(cnt);
	}
}
