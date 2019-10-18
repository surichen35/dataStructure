package point.to.Future;

public class LongestSubstring {
	public static String longestPalindrome(String s) {
	    if (s.equals(""))
	        return "";
	    String origin = s;
	    String reverse = new StringBuffer(s).reverse().toString(); //�ַ�������
	    int length = s.length();
	    int[][] arr = new int[length][length];
	    int maxLen = 0;
	    int maxEnd = 0;
	    for (int i = 0; i < length; i++)
	        for (int j = 0; j < length; j++) {
	            if (origin.charAt(i) == reverse.charAt(j)) {
	                if (i == 0 || j == 0) {
	                    arr[i][j] = 1;
	                } else {
	                    arr[i][j] = arr[i - 1][j - 1] + 1;
	                }
	            }
	            if (arr[i][j] > maxLen) { 
	                maxLen = arr[i][j];
	                maxEnd = i; //�� i λ�ý�β���ַ�
	            }

	        }
	    System.out.println(s.substring(maxEnd - maxLen + 1, maxEnd + 1));
		return s.substring(maxEnd - maxLen + 1, maxEnd + 1);
		
	}
	public static void main(String[] args) {
		longestPalindrome("abcdcd");
	}
}
