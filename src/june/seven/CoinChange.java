package june.seven;

import java.util.Date;

public class CoinChange {
	public int change(int amount, int[] coins) {
        int len = coins.length;
        int[] dp = new int[amount + 1];
        
        dp[0] = 1;
        
        for(int i = 1; i <= len; i++) {
        	for(int j = 0; j <= amount; j++) {
        		if(j >= coins[i - 1]) {
        			dp[j] = dp[j] + dp[j - coins[i-1]];
        		}
        	}
        }
        return dp[amount];
    }

	public static void main(String[] args) {
		CoinChange cc = new CoinChange();
		
		int[] coins = {1, 2, 5};
		System.out.println(cc.change(5, coins));
		
		int[] coins1 = {2};
		System.out.println(cc.change(3, coins1));
		
		int[] coins2 = {10};
		System.out.println(cc.change(10, coins2));
		
		System.out.println(new Date());
		int[] coins3 = {3,5,7,8,9,10,11};
		System.out.println(cc.change(500, coins3));
		System.out.println(new Date());
		
	}

}
