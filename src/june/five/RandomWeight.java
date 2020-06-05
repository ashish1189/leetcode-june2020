package june.five;

import java.util.Random;
import java.util.TreeMap;

public class RandomWeight {
	TreeMap<Integer, Integer> map = new TreeMap<>();
    Random random = new Random();
    int max = 0;
    public RandomWeight(int[] w) {
        for(int i = 0; i < w.length; i++) {
            max += w[i];
            map.put(max, i);
        }
    }
    
    public int pickIndex() {
    	int key = map.ceilingKey(random.nextInt(max) + 1);
        //int key= map.higherKey(random.nextInt(max));
        return map.get(key);
    }
}
