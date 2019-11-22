package fighting;

import java.util.HashMap;

/**
 * @author suriChen
 * 查找第一个只出现一次的字符
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）
 * e.g
 * input: abcade
 * output:1
 * */
public class FirstNotRepeatingChar {
	 public static int FirstNotRepeatingChar(String str) {
		 if(str == null)
			 return -1;
		 StringBuilder s = new StringBuilder(str);
		 HashMap<Character,Integer> map = new HashMap<>();
		 int length = str.length();
		 for(int i=0;i<length;i++) {
			 if(!map.containsKey(str.charAt(i)) || map.size()==0)
				 map.put(str.charAt(i), i);
			 else
				 {
				 	int index = map.get(str.charAt(i));
				 	s.setCharAt(i, '\0');
				 	s.setCharAt(index, '\0');
				 }
		 }
		 for(int i=0;i<s.length();i++)
			 if(s.charAt(i)!='\0')
				 return i;
	     return -1;
	    }
	 public static void main(String[] args) {
		 StringBuilder str = new StringBuilder("abcd");
		 str.deleteCharAt(3);
		 System.out.println(FirstNotRepeatingChar("a"));
	}
}
