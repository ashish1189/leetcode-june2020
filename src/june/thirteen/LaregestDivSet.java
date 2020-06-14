package june.thirteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LaregestDivSet {
	public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();
		
		if(nums==null||nums.length==0)
	        return result;
	 
	    Arrays.sort(nums);
	    
	    int[] dp = new int[nums.length];
	    int[] idx = new int[nums.length];
	    
	    Arrays.fill(dp, 1);
	    Arrays.fill(idx, -1);
	    
	    int max = 0, maxIdx = -1;
	    
	    for(int i = 0; i < dp.length; i++) {
	    	for(int j = i - 1; j >= 0; j--) {
	    		if(nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
	    			dp[i] = dp[j] + 1;
	    			idx[i] = j;
	    		}
	    	}
	    	
	    	if(max < dp[i]) {
	    		max = dp[i];
	    		maxIdx = i;
	    	}
	    }
	    
	    int i=maxIdx;
	    while(i>=0){
	        result.add(nums[i]);
	        i=idx[i];
	    }
	    
	    return result;
    }
}
