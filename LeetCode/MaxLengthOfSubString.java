import java.util.HashMap;
import java.util.HashSet;

public class MaxLengthOfSubString {
	public static void main(String args[]) {
		System.out.println(lengthOfLongestSubstring_s2("abcac"));
	}
	public static  int lengthOfLongestSubstring_s1(String s) {
			if(s == null)
				return 0;
			HashMap<Integer, Character> map = new HashMap<>();
	        int max=0;
            for(int i=0;i<s.length();i++)
            {
            	int j = i;
            	while(j<s.length() && !map.containsValue(s.charAt(j)))
            	{
            		map.put(j,s.charAt(j));
            		j++;
            	}
            	max = (map.size()>max)?map.size():max;
                map.clear();
               	continue;
             }
            
	        return max;
	    }
	public static  int lengthOfLongestSubstring_s2(String s) {
		if(s == null)
			return 0;
		int max = 0;
		int i=0,j=0;
		HashSet<Character> set = new HashSet<>();
		while(i<s.length() && j<s.length()) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				max = (j-i > max)? j-i:max;
			}
			else {
				set.remove(s.charAt(i++));
			}
		}
        return max;
    }
}
