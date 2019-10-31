package Datastructer.Review;

public class BinarySearch {
	//�ǵݹ��㷨
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
	//�ݹ��㷨
	public static int binarySearchRecursion(int target,int[] a,int start,int end) {
		int mid = (end-start)/2+start;
		if(a[mid] == target)
			return mid;
		if(end<=start)
			//�˴��ж�������end<=start�����target>a[mid]ֱ�����һ����û�ҵ���end==startʱ����ִ��
			// binarySearchRecursion(target,a,mid+1,end);�ͻ�����Խ��
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
