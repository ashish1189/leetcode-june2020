package june.eleven;

public class ColorArray {

	public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;
        
        for(int i : nums) {
            if(i == 0)
                zero++;
            
            if(i == 1)
                one++;
            
            if(i == 2)
                two++;
        }

        for(int i = 0; i < nums.length; i++) {
            if(zero > 0 && i < zero)
                nums[i] = 0;
            else if (one > 0 && i < (zero + one))
                nums[i] = 1;
            else if (two > 0 && i < (zero + one + two))
                nums[i] = 2;
        }
    }
	
	public static void main(String[] args) {
		ColorArray ca = new ColorArray();
		int[] a = { 2,0,2,1,1,0 };
		ca.sortColors(a);
		
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
		
		System.out.println("");
		
		int[] b = { 0,1,2 };
		ca.sortColors(b);
		
		for(int i = 0; i < b.length; i++)
			System.out.print(b[i]+" ");
		
		System.out.println("");
	}

}
