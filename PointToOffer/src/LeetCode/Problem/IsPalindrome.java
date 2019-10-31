package point.to.Future;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {
	//solution 1
	public static boolean isPalindrome(int x) {
		String reversedStr = (new StringBuilder(x + "")).reverse().toString();
        return (x + "").equals(reversedStr);
//		boolean res = true;
//		if(x<=0)
//			return false;
//		String str = String.valueOf(x);
//		for(int i=0;i<str.length()/2;i++) {
//			if(str.charAt(i)==str.charAt(str.length()-1-i))
//				continue;
//			else
//				return false;
//		}
//		return res;
	}
	//solution 2
	public static boolean isPalindromeMath(int x) {
		if(x<0)
			return false;
		else if(x>=0 && x<=9)
			return true;
		int l = 0;
		int num = x;
		for(;num>0;l++)
		{
			num=num/10;
		}
//		for(int i=0;i<l;i++) {
//			if(x%(pow(10,l-1-i)) == x%(pow(10,)))
//		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(99033));
		List<Integer> s = new ArrayList();
	}
}
