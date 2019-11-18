package fighting;
/**
 * @author suriChen
 *	�ҳ����ִ�����������һ�볤�ȵ�����
 *
 * */
public class MoreThanHalfNum {
	/*
	 * 	������
	 * 	���ִ�������һ����һ�����������λ��
	 * */
	public static int MoreThanHalfNum_Solution(int [] array) {
		//ע���жϱ߽�����
			if(array.length<=0)
				return 0;
			if(array.length==1)
				return array[0];
			quickSort(array, 0, array.length-1);
			int length = 0;
			int mid = array.length/2;
			for(int i=mid;i>0;i--) {
				if(array[i] == array[mid])
					length++;
			}
			for(int i=mid;i<array.length;i++) {
				if(array[i] == array[mid])
					length++;
			}
			if(length>mid+1)
				return array[mid];
	        return -1;
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
		int[] arr = {4,2,2,2,4,0,1};
		System.out.println(MoreThanHalfNum_Solution(arr));
	}
}
