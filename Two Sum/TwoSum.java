import java.util.*;
/**
 * @author suriChen 
 * */
public class TwoSum {
	public static void main(String[] args) {
		int a[]= {3,5,6,4,3,1};
		int target = 6;
		int temp[] = new int[2];
		System.out.println(Arrays.toString(getIndex(a,target)));
	}
//Ç¶Ì×Ñ­»·O(n^2)
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

//HashMap
	public static int[] getIndices(int[] num,int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int indices[] = new int[2];
		for(int i=0;i<num.length;i++) {
			if(map.containsKey(target - num[i])) {
				indices[0] = map.get(target - num[i]);
				indices[1] = i;
			}
		}
		return indices;
	}
	
}
