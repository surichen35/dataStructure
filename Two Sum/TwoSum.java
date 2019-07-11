import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		int a[]= {3,5,6,4,3,1};
		int target = 6;
		int temp[] = new int[2];
		System.out.println(Arrays.toString(getIndex(a,target)));
	}

	public static int[] getIndex(int[] a,int target) {
		int temp[] = new int[2];
		for(int i=0;i<a.length/2;i++) {
			for(int j=a.length-1;j>i;j--)
				if(a[i]+a[j]==target)
				{
					temp[0]=i;
					temp[1]=j;
				}
		}
		return temp;
	}
}
