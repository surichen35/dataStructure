package point.to.Future;
/**
 * ������ʽ
 * Regular Express
 * @author suriChen
 * */
import java.util.regex.Pattern;

public class Regex {
	public static boolean isMacth(String s,String p) {
		if(s=="")
		{
			if(p==""||p==s||p=="*"||p==".")
				return true;
		}
		boolean t = Pattern.matches(p,s);
		return t;
	}
	public static void main(String[] args) {
		//ƥ������
//		String str = "andy@163.com";
//		String mailRegEx = "^\\w+@\\w{1,4}+.(com|cn)$";
//		System.out.println(Pattern.matches(mailRegEx, str));
//		�绰ƥ��
//		String tx ="15614321563";
//		String telRegEx = "1+(3|5)\\d{8}\\d";
		String numberRegEX = "\\s*";
		String tt = "";
		boolean t = Pattern.matches(numberRegEX,tt);
		System.out.println(t);
	}
	
}
