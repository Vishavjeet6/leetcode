package leetcode.hashtable;

public class NumberofGoodPairs1512 {

    public int numIdenticalPairs(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int count = 0;
        for( int x: nums){
            count += hm.getOrDefault(x, 0);
            hm.put(x,hm.getOrDefault(x,0)+1);
            
        }
        
        return count;
    }
}
