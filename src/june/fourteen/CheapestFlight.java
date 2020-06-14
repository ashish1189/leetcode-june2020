package june.fourteen;

import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlight {
	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int min = Integer.MAX_VALUE;
        int[][] graph = new int[n][n];
        int[] minPrices = new int[n];
        
        for (int[] flight : flights) {
            int start = flight[0];
            int end = flight[1];
            graph[start][end] = flight[2];
        }
        
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> prices = new LinkedList<>();
        q.add(src);
        prices.add(0);
        
        while (!q.isEmpty() && K >= 0) {
            K--;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int start = q.poll();
                int priceTillNow = prices.poll();
                for (int j = 0; j < n; j++) {
                    int price = graph[start][j];
                    if (price > 0) {
                        int curPrice = priceTillNow + price;
                        int oldPrice = minPrices[j];
                        if (oldPrice == 0 || oldPrice > curPrice) {
                            minPrices[j] = curPrice;
                            q.add(j);
                            prices.add(curPrice);
                            if (j == dst && min > curPrice) {
                                min = curPrice;
                            }
                        }
                    }
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
