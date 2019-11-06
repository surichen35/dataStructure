package fighting;
/**
 * @author suriChen
 * 今天真的超级困啊
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * */
public class ReOrderArray {
/**1.计算奇数个数
 * 2.新建数组完全拷贝原数组
 * 3.遍历一遍将奇数拷贝到原数组前面，偶数拷贝至后面
 * **/
	public void reOrderArray(int[] array) {
		int count=0;
		int[] temp = new int[array.length];
		for(int i=0;i<array.length;i++)
			{
				temp[i] = array[i];
				if(array[i]%2!=0)
					count++;
			}
		int j = 0;
		for(int i=0;i<temp.length;i++) {
			if(temp[i]%2!=0)
				array[j++] = temp[i];
			else {
				array[count] = temp[i];
				count+=1;
			}
		}
	}
/**
 *  相当于内部排序，因此找稳定的排序算法，如，前后交换的冒泡
 * */
	public void reOrderBybubble(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1-i;j++)
			{
		       if(array[j]%2==0&&array[j+1]%2==1){
					int t = array[j];
					array[j] = array[j+1];
					array[j+1] = t;
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}
	public static void main(String[] args) {
		int[] array = new int[4];
		for(int i=0;i<=3;i++)
			array[i]= i;
		ReOrderArray re = new ReOrderArray();
		re.reOrderBybubble(array);
	}
}
