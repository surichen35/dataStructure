package fighting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author suriChen
 * 	获取最小的K个数
 * */
public class GetLeastNumbers {
	//冒泡排序
	 public static ArrayList<Integer> GetBybubbleSort(int[] a, int k){
		 ArrayList<Integer> res = new ArrayList<>();
		 if(a.length == 0 || k>a.length || k==0)
			 return res;
		 int count = k;
		 for(int i=0;i<a.length;i++) {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]>a[j]) {
					 int temp = a[j];
					 a[j] = a[i];
					 a[i] = temp;
				 }
				 }
				 if((i>0 && a[i]!=a[i-1]) || (i==0))
					{
					 res.add(a[i]);
					 count--;
					}
				 if(count==0)
					return res;
			 }
			return null;
	 }
	 
	 //傻瓜办法
	 public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		 ArrayList<Integer> res = new ArrayList<>();
		 Set<Integer> hashSet = new HashSet<>();
		 if(input.length == 0 || k>input.length)
			 return res;
		 quickSort(input,0,input.length-1);
		 int count = k;
		 int i = 0;
		 while(i<input.length && count>=1) {
			 if(!hashSet.contains(input[i]))
				 	{
				 		hashSet.add(input[i]);
				 		res.add(input[i]);
				 		count--;
				 	}
				 i++;
		 }
		 if(count>1)
			 return null;
		 else 
			 return res;
	  }
	 public static void quickSort(int[] arr,int left,int right) {
			if(left>=right)
				return;
			int l = left;
			int r = right;
			int pivot = arr[left];
			while(l<r) {
				while(arr[r]>=pivot && l<r)
					r--;
				while(arr[l]<=pivot && l<r)
					l++;
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
			arr[left] = arr[l];
			arr[l] = pivot;	
			quickSort(arr,left,l-1);
			quickSort(arr,l+1,right);
		}
	 public static void main(String[] args) {
		 int[] arr = {3};
		 
		 System.out.println(GetBybubbleSort(arr, 0).toString());
		 //System.out.println(GetLeastNumbers_Solution(arr,6).toString());
	}
}
