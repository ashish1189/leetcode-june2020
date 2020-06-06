package june.six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class QueueReconstruction {

	public int[][] reconstructQueue(int[][] people) {
        if(people == null)
        	return new int[0][0];
		
		Arrays.sort(people, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] != o2[0])
					return o2[0] - o1[0];
				else
					return o1[1] - o2[1];
			}
		});

		ArrayList<int[]> list = new ArrayList<>();
		for (int i = 0; i < people.length; i++) {
			int[] arr = people[i];
			list.add(arr[1], arr);
		}
		
		return list.toArray(new int[list.size()][]);
    }

	public static void main(String[] args) {
		QueueReconstruction qr = new QueueReconstruction();
		
		int[][] ppl = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
		
		int[][] ans = qr.reconstructQueue(ppl);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i][0]+" "+ans[i][1]+"  ");
		}
	}

}
