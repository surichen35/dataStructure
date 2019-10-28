import java.util.*;
/**
 * @author suriChen 
 *
 * */
public class TwoSum {
	public static void main(String[] args) {
		int a[]= {3,5,6,4,3,1};
		int target = 6;
		int temp[] = new int[2];
		System.out.println(Arrays.toString(getIndex(a,target)));
	}
//嵌套循环
//时间复杂度计算 O(n^2)
	public static int[] getIndex(int[] nums,int target) {
		int temp[] = new int[2];
		for(int i=0;i<nums.length;i++) {
			for(int j=nums.length-1;j>i;j--)
				if(nums[i]+nums[j]==target)
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
