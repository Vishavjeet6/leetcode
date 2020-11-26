package leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        
        int result = 0;
        int rem;

        while (x != 0)
        {
            rem = x%10;
//             x /= 10;
            x = x/10;
            if(result > Integer.MAX_VALUE/10 || result < Integer.MIN_VALUE/10){
                return 0;
            }
            
            result = result*10 + rem;
            }
        return result;
    }

}
