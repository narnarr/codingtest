package level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 2941
public class CroatianAlphabetIdea {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		
		String[] arr = {"c=", "c=", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for (int i=0; i<arr.length; i++) {
			in=in.replace(arr[i], "_");
		}
		System.out.println(in.length());
	}
}
