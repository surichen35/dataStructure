package fighting;
/**
 * @author suriChen
 * 	���������������
 * */
public class FindGrestSumSub {
//ɵ�Ϸ���
	public static int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 1)
            return array[0];
        int max = array[0];
        for(int i=0;i<array.length;i++){
        	int sum = array[i];
            for(int j=i+1;j<array.length;j++){
               sum+=array[j]; 
               max = max<sum?sum:max;
            }
            max = max<array[i]?array[i]:max;
        }
	return max;
    }
//��̬�滮
	public static int FindGreatestSumOfSubArrayDP(int[] array) {
		int max = array[0];
		int res = array[0];
		for(int i=1;i<array.length;i++)
		{
			max = Math.max(max+array[i], array[i]);
			res = Math.max(max, res);
		}
		return res;
	}
	public static void main(String[] args) {
		int[] a = {-2,-8,-1,-5,-9};
		System.out.println(FindGreatestSumOfSubArrayDP(a));
	}
}
