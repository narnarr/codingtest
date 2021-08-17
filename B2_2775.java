package level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ApartmentPresident
public class B2_2775 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int i=0; i<T; i++) {
			int k = Integer.parseInt(br.readLine()); // floor
			int n = Integer.parseInt(br.readLine()); // room
			int[][] apartment = new int[k+1][n+1];
			
			// 0th floor
			for (int j=1; j<=n; j++) {
				apartment[0][j] = j;
			}
			
			//1st room
			for (int j=1; j<=k; j++) {
				apartment[j][1] = 1;
			}
			
			for (int j=1; j<=k; j++) {
				for (int v=2; v<=n; v++) {
					apartment[j][v] = apartment[j][v-1]+apartment[j-1][v];
				}
			}
			sb.append(apartment[k][n]).append('\n');
		}
		System.out.println(sb);
	}
}
