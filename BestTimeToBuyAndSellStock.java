package leetcode;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int currMin = Integer.MAX_VALUE;
        int allMax = 0;
        
        for(int stock: prices){
            currMin = Math.min(currMin, stock);
            allMax = Math.max(allMax, stock-currMin);
        }   
        return allMax;
        
    }
}
