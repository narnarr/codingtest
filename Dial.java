package level7;

import java.io.IOException;

// 백준 5622
public class Dial {

	public static void main(String[] args) throws IOException {
		int c=0, sec=0, total=0;

		while ((c=System.in.read()) > 64) {
			if (c<83) sec = (c+1)/3-19;
			else if (c=='S') sec=8;
			else if (c<87) sec=9;
			else sec=10;
			total+=sec;
		}
		System.out.println(total);
	}

}
