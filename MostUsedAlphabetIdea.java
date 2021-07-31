package level7;

import java.io.IOException;
// 백준 1157
public class MostUsedAlphabet {
	public static void main(String[] args) throws IOException {
		int[] arr = new int[26];
		int c = 0, max = 0, maxAlphabet = 0;
		
		while ((c = System.in.read()) > 64) {
			if (c>96) c-=97;
			else c-=65;
			
			arr[c]++;
			
			if(arr[c] > max) {
				max=arr[c];
				maxAlphabet = c;
			}
			else if(arr[c] == max) {
				maxAlphabet = 63;
			}
		}
		System.out.println((char) (maxAlphabet+65));
	}
}
