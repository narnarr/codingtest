package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateFile {
	public String[] solution(String[] param0) {

		String[] temp = new String[param0.length];
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> answerTemp = new ArrayList<>();

		for (int i = 0; i < param0.length; i++) {
			String[] array = param0[i].split("/");
			temp[i] = array[array.length - 1];

			String filename = temp[i].substring(0, 1);
			String extension = temp[i].substring(temp[i].length() - 1, temp[i].length());
			String file = filename + "." + extension;
			temp[i] = file;
		}

		for (String s : temp) {
			if (!name.contains(s)) {
				name.add(s);
			}
		}

		for (String n: name) {
			int duplicateCnt = 0;

			for (int m = 0; m < temp.length; m++) {
				if (n.equals(temp[m])) {
					duplicateCnt++;
				}
			}
			if (duplicateCnt > 1) {
				answerTemp.add(n);
				answerTemp.add(String.valueOf(duplicateCnt));
			}
		}
		
		String[] answer = answerTemp.toArray(new String[answerTemp.size()]);
		return answer;

	}

	public static void main(String[] args) {

		DuplicateFile test = new DuplicateFile();
		String[] param1 = { "/a/a_v2.x", "/b/a.x", "/c/t.z", "/d/a/t.x", "/e/z/t_v1.z", "/k/k/k/a_v9.x" };
		String[] param2 = { "/t.z", "/z/z_v2.z", "/a.z", "/d/b.z", "/d/a/t.z" };
		String[] param3 = { "/t.z", "/b/b.z", "/a.z", "/e/k.z", "/d/a/x_v2.z" };

		for (String a : test.solution(param1)) {
			System.out.printf(a + ", ");
		}
		System.out.println();

		for (String a : test.solution(param2)) {
			System.out.printf(a + ", ");
		}
		System.out.println();
		
		for (String a : test.solution(param3)) {
			System.out.printf(a + ", ");
		}

	}
}
