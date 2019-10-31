package LeetCode.Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 * @author siyu_chen
 * LeetCode 20
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * 审题要认真啊！！！
 * */
public class IsValid {
	public static boolean isValid(String s) {
		if(s.length()%2!=0)
			return false;
		if(s==null)
			return true;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == '('|| c=='{' || c == '[')
				stack.push(c);
			else if(!stack.isEmpty()&&(( stack.peek()=='(' && c == ')') || ((c == ']' && stack.peek()=='[')) || ((c == '}' && stack.peek()=='{'))))
			{
				stack.pop();
				continue;
			}
			else
				return false;
		}
		if(stack.isEmpty())
			return true;
		return false;
		
	}
	public static void main(String[] args) {
		System.out.println(isValid(")]]"));	
	}
}
