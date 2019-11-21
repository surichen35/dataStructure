package fighting;

import java.io.FileNotFoundException;

/**
 * @author suriChen
 *	 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *	例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 *	思路，先判断两数大小(若AB>BA，则判断A>B)
 * */
public class PrintMinNum {
//用冒泡排序,因为是比较排序
	public static String PrintMinNumber(int[] numbers) {
		String str = "";
		for(int i=0;i<numbers.length;i++)
			for(int j=i+1;j<numbers.length;j++) {
				if(compare(numbers[i],numbers[j]))
				{
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		try {
			for(int i=0;i<numbers.length;i++)
				str+=String.valueOf(numbers[i]);
		}catch(Exception e){
			return null;
		}
		return str;
	}
//冒泡排序18MS
//归并排序15MS
	public static String PrintMinNumber2(int[] numbers) {
		String str = "";
		mergeSort(numbers, 0, numbers.length-1);
		try {
			for(int i=0;i<numbers.length;i++)
				str+=String.valueOf(numbers[i]);
		}catch(Exception e){
			return null;
		}
		return str;
	}
//试试归并排序
	public static int[] mergeSort(int[] arr,int low,int high) {
		if(low<high) {
			int mid = (low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
		return arr;
	}
		
	public static void merge(int[] arr,int low,int mid,int high) {
		int l = low;
		int h = mid+1;
		int[] temp = new int[high-low+1];
		int i=0;
		while(l<=mid && h<=high)
		{
			temp[i++] = compare(arr[l],arr[h])?arr[h++]:arr[l++];
		}
		while(l<=mid)
			temp[i++] = arr[l++];
		while(h<=high)
			temp[i++] = arr[h++];
		for(int j=0;j<temp.length;j++)
			arr[low+j] = temp[j];
	}
	public static boolean compare(int num1,int num2) {
		String s1 = String.valueOf(num1);
		String s2 = String.valueOf(num2);
		if(Integer.parseInt(s1+s2) > Integer.parseInt(s2+s1))
			return true;
		return false;
	}
	public static void main(String[] args) {
		int[] arr = {3,5,1,4,2};
		System.out.println(PrintMinNumber(arr));
	}
}
