package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// Greedy meetings timetable
public class S2_1931 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		ArrayList<Time> meetings = new ArrayList<Time>();
		int N = Integer.parseInt(br.readLine());
		int baton = 0, count = 0;

		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			meetings.add(new Time(start, end));
		}

		Collections.sort(meetings);

		for (Time a : meetings) {
			if (a.start >= baton) {
				count++;
				baton = a.end;
			}
		}

		System.out.println(count);
	}

}

class Time implements Comparable<Time> {
	int start, end;

	public Time(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Time t) {
		if (this.end > t.end) {
			return 1;
		} else if (this.end == t.end) {
			if (this.start > t.start) {
				return 1;
			}
		}

		return -1;
	}
}
