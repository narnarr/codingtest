package level1;

import java.util.Arrays;

public class NumK {
	
	public int[] solution(int[] array, int[][] commands) {
		int i=0, j=0, k=0;
		int[] answer= new int[commands.length];
		
		for (int n=0; n<commands.length; n++) {
			i = commands[n][0];
			j = commands[n][1];
			k = commands[n][2];
			// System.out.println(i+","+j+","+k);
			
			int[] temp = new int[j-i+1];
			int index = 0;
			for (int a=(i-1); a<j; a++) {
				temp[index] = array[a];
				index++;
			}	
			Arrays.sort(temp);
			answer[n]=temp[k-1];
		}
		for (int c: answer) {
			System.out.println(c);
		}
		return answer;
		}
}
