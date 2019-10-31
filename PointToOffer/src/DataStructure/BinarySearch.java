package fundamental;

public class BinarySearch {
	//非递归算法
	public static int binarySearch(int target,int[] a) {
		if(a.length<=0)
			return -1;
		int start = 0;
		int end = a.length-1;
		while(start<=end)
		{
			int mid = (end-start)/2+start;
			if(a[mid] == target)
				return mid;
			if(target>a[mid])
				start = mid+1;
			if(target<a[mid])
				end = mid-1;
		}
		return -1;
	}
	//递归算法
	public static int binarySearchRecursion(int target,int[] a,int start,int end) {
		int mid = (end-start)/2+start;
		if(a[mid] == target)
			return mid;
		if(end<=start)
			//此处判断条件是end<=start，如果target>a[mid]直到最后一个都没找到，end==start时，再执行
			// binarySearchRecursion(target,a,mid+1,end);就会数组越界
			return -1;
		else {
			if(target>a[mid])
				return binarySearchRecursion(target,a,mid+1,end);
			if(target<a[mid])
				return binarySearchRecursion(target,a,start,mid-1);
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {2,4,6,8};
		if(binarySearchRecursion(17,array,0,3)==-1)
			System.out.println("Did not find the num");
		else
			System.out.println("Find the num");
	}
}
