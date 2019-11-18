package fighting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author suriChen
 * 	获取最小的K个数
 * */
public class GetLeastNumbers {
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
		 int[] arr = {};
		 System.out.println(GetLeastNumbers_Solution(arr,6).toString());
	}
}
