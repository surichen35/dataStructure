package fighting;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author suriChen
 * ���ַ���ȫ����
 * ��ָoffer 38
 * */
public class Permutation {
	static ArrayList<String> res = new ArrayList<>();
	public static ArrayList<String> Permutation(String str){
		if(str.length()==1)
		{
			res.add(str);
			return res;
		}
        else if(str.length()==0)
            return res;
		PremuHelper(str,0);
		Collections.sort(res);
		return res;
	}
	public static void PremuHelper(String str,int begin) {
		StringBuilder strBuilder = new StringBuilder(str);
		if(begin == str.length()-1 && !res.contains(str))
			res.add(str);
		else
		{
			//���ַ����ֳ������֣���һ����ĸΪһ�����֣�ʣ�µ�������һ������
			for(int i=begin;i<strBuilder.length();i++) {
				char temp = strBuilder.charAt(i);
				strBuilder.setCharAt(i, strBuilder.charAt(begin));
				strBuilder.setCharAt(begin,temp);
				
				PremuHelper(strBuilder.toString(),begin+1);
				
				temp = strBuilder.charAt(i);
				strBuilder.setCharAt(i, strBuilder.charAt(begin));
				strBuilder.setCharAt(begin,temp);
			}
		}
	}
	public static void main(String[] args) {
		String str = "abb";
		Permutation(str);
		System.out.println(res.toString());
	}
}
