package leetcode;

public class MakingFileNamesUnique1487 {
	
	class Solution {
	    public String[] getFolderNames(String[] names) {
	        Map<String, Integer> nameMap = new HashMap<>();
	        int n = names.length;
	        String[] res = new String[n];
	        for (int i = 0; i < n; i++) {
	            if (!nameMap.containsKey(names[i])) {
	                nameMap.put(names[i], 1);
	                res[i] = names[i];
	            }
	            else {
	                int val = nameMap.get(names[i]);
	                String name = names[i] + "(" + val + ")";
	                while (nameMap.containsKey(name)) {
	                    name = names[i] + "(" + ++val + ")";
	                }
	                res[i] = name;
	                nameMap.put(names[i], ++val);
	                nameMap.put(name, 1);
	            }
	        }
	        return res;
	    }
	}

}
