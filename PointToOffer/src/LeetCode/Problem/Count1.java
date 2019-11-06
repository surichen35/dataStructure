package fighting;
/**
 * @author suriChen
 * 位运算符：
 * m<<n将m左移n位，将最左侧的n位丢弃，同时在右侧补上n个0
 * m>>n将m右移n位，将最右侧的n位丢弃，同时在左侧补上n个0，如果m为负数，当移动后在左侧补上n个1
 * 由于右移有明显缺陷，Java提供了一个“无符号右移运算符”，移动时无需考虑原数字的符号：
 * ">>>"，其余与右移相同
 * */
public class Count1 {
//直接进行移动判定
//时间复杂度为n
	public int NumberOf1(int n) {
		int count = 0;
		int flag = 1;
		while(n!=0) {
			count += n&flag;
			//无符号右移运算符
			n = n>>>1;
		}
		return count;
    }
//通过每次减1进行计算,计算次数缩减至，有几个1，计算几次
	public int NUmberOf1S2(int n) {
		int count =0;
		while(n!=0) {
			n = n&(n-1);
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Count1 co = new Count1();
		co.NUmberOf1S2(4);
	}
}
