package level7;

import java.io.IOException;

// 백준 2941
public class CroatianAlphabet {

	public static void main(String[] args) throws IOException {
		// 61 =: c dz s z
		// 45 -: c d
		// 106 j: l n

		int c = 0, cnt = 0, prev = 0, pprev=0;

		while ((c = System.in.read()) > 44) {
			switch (c) {
			case '=':
				if (prev=='z'&&pprev=='d') {
					pprev = prev;
					prev = c;
					cnt--;
					break;
				} else if (prev=='z'&&pprev!='d') {
					pprev = prev;
					prev = c;
					break;
				}
				if (prev == 'c' || prev == 's' || prev == 'z') {
					pprev = prev;
					prev = c;
					break;
				}
			case '-':
				if (prev == 'c' || prev == 'd') {
					pprev = prev;
					prev = c;
					break;
				}
			case 'j':
				if (prev == 'l' || prev == 'n') {
					pprev = prev;
					prev = c;
					break;
				} else {
					cnt++;
					pprev = prev;
					prev = c;
					break;
				}
			default:
				cnt++;
				pprev = prev;
				prev = c;
				break;
			}
		}
		System.out.println(cnt);
	}

}
