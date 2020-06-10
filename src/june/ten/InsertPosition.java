package june.ten;

public class InsertPosition {

	public int searchInsert(int[] nums, int target) {
        if(nums.length == 0)
            return 0;
        
        if(nums.length == 1 && target > nums[0])
        	return 1;
        	
        if(target <= nums[0])
            return 0;

        int pos = -1;
        for(int i = 1; i < nums.length; i++) {
            if(target <= nums[i]) {
            	pos = i;
            	break;
            }
            else 
            	pos = i + 1;
        }
        
        return pos;
    }
	
	public static void main(String[] args) {
		InsertPosition ip = new InsertPosition();
		
		int[] A1 = {1,3,5,6};
		int t1 = 5;
		System.out.println(ip.searchInsert(A1, t1));
		
		int[] A2 = {1,3,5,6};
		int t2 = 2;
		System.out.println(ip.searchInsert(A2, t2));
		
		int[] A3 = {1,3,5,6};
		int t3 = 7;
		System.out.println(ip.searchInsert(A3, t3));
		
		int[] A4 = {1,3,5,6};
		int t4 = 0;
		System.out.println(ip.searchInsert(A4, t4));

		int[] A5 = {1};
		int t5 = 3;
		System.out.println(ip.searchInsert(A5, t5));
	}

}
