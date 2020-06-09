package june.nine;

public class IsSubsequence {

	public boolean isSubsequence(String s, String t) {
        int j = 0; 
        int m = s.length();
        int n = t.length();
        
        for (int i = 0; i < n && j < m; i++) 
            if (s.charAt(j) == t.charAt(i)) 
                j++; 
        
        return (j == m);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
