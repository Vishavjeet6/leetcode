package leetcode.hashtable;

import java.util.HashMap;

public class FirstUniqueCharacterInAString387 {
	public int firstUniqChar(String s) {
		
		if(s==null || s.length()==0) {
			return -1;
		}
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char c: s.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		
        for(int i=0; i<s.length(); i++){
            if(hm.get(s.charAt(i)) ==1){
                return i;
            }
        }
		return -1;
	        
    }
}
