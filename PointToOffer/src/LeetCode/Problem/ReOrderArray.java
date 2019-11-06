package fighting;
/**
 * @author suriChen
 * ������ĳ�������
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣�
 * ���е�ż��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
 * */
public class ReOrderArray {
/**1.������������
 * 2.�½�������ȫ����ԭ����
 * 3.����һ�齫����������ԭ����ǰ�棬ż������������
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
 *  �൱���ڲ�����������ȶ��������㷨���磬ǰ�󽻻���ð��
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
