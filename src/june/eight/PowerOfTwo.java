package june.eight;

public class PowerOfTwo {

	public boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;
        
        return ((n&(-n)) == n); 
    }
	
	public static void main(String[] args) {
		PowerOfTwo two = new PowerOfTwo();
		
		if (two.isPowerOfTwo(1) &&
				two.isPowerOfTwo(4) &&
				two.isPowerOfTwo(16) &&
				!two.isPowerOfTwo(-4) &&
				!two.isPowerOfTwo(Integer.MIN_VALUE) &&
				!two.isPowerOfTwo(0)
			)
			System.out.println("All test cases passed");
		else
			System.out.println("Some test cases failed");

	}

}
