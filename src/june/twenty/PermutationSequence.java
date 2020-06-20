package june.twenty;

public class PermutationSequence {

	public String getPermutation(int n, int k) {
		/*
		 * if(n == 1) return "1";
		 * 
		 * String str = "";
		 * 
		 * for(int i = 1; i <= n; i++) str = str + i;
		 * 
		 * List<Integer> list = new ArrayList<>(); permutation("", str, list, k);
		 * //Collections.sort(list);
		 * 
		 * return list.get(k - 1).toString();
		 */

		boolean[] output = new boolean[n];
		StringBuilder buf = new StringBuilder("");

		int[] res = new int[n];
		res[0] = 1;

		for (int i = 1; i < n; i++)
			res[i] = res[i - 1] * i;

		for (int i = n - 1; i >= 0; i--) {
			int s = 1;

			while (k > res[i]) {
				s++;
				k = k - res[i];
			}

			for (int j = 0; j < n; j++) {
				if (j + 1 <= s && output[j]) {
					s++;
				}
			}

			output[s - 1] = true;
			buf.append(Integer.toString(s));
		}

		return buf.toString();
	}

	/*
	private static void permutation(String prefix, String str, List<Integer> list, int k) {
		int n = str.length();
		if (n == 0) {
			list.add(Integer.parseInt(prefix));
		} else {
			for (int i = 0; i < n && i < k; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), list, k);
		}
	}
	*/

	public static void main(String[] args) {
		PermutationSequence ps = new PermutationSequence();

		System.out.println(ps.getPermutation(3, 3));
		System.out.println(ps.getPermutation(4, 9));
		System.out.println(ps.getPermutation(1, 1));
		System.out.println(ps.getPermutation(9, 78494));

	}

}
