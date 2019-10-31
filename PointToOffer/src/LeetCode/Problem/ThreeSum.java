package fighting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author suriChen
 * LeetCode 15
 * 	给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * 	注意：答案中不可以包含重复的三元组。
 * */
public class ThreeSum {
//暴力解法，通过311个测试用例，但是最后超时了
	public static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3)return null;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        for(int i=0;i<nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		if(findNum(nums,j+1,0-nums[i]-nums[j]))
        		{
        			List<Integer> list = new ArrayList<>();
        			list.add(nums[i]);
        			list.add(nums[j]);
        			list.add(0-nums[i]-nums[j]);
        			Collections.sort(list);
        			if(!res.contains(list))
        				res.add(list);
        		}
        	}
        }
        return res;
    }

	//暴力解法优化：减少无效计算
	//思路：先将数组排序，这样可以有效的减少正数的无效计算
		public static List<List<Integer>> threeSumImp(int[] nums) {
	        List<List<Integer>> res = new ArrayList<List<Integer>>();
	        if(nums.length<3)return res;
	        Arrays.sort(nums);
	        for(int k = 0;k<nums.length-2;k++) {
	        	if(nums[k]>0)break;//当最小值大于0时，不可能与后面的和数为0，因此跳出循环
	        	if(k>0 && nums[k]==nums[k-1])continue;//当后一个数与前一个数相同时，得到的三元组必定相同，因此不进行计算
	        	int i = k+1;
	        	int j = nums.length-1;
	        	while(i!=j) {
	        		int sum = nums[k]+ nums[i]+ nums[j];
	        		if(sum<0)
	        		{
	        			while(i<j && nums[i]==nums[++i]);//跳过所有相同的nums[i]和nums[j]
	        		}else if(sum>0)
	        		{
	        			while(i<j && nums[j]==nums[--j]);
	        		}
	        		else {
	        		//sum==0
	        			res.add(new ArrayList<>(Arrays.asList(nums[k],nums[i],nums[j])));
	        			while(i<j && nums[i]==nums[++i]);
	        			while(i<j && nums[j]==nums[--j]);
	        		}
	        	}
	        }
	        return res;
	    }
	
	public static boolean findNum(int[] nums,int n,int target) {
		for(int i=n;i<nums.length;i++) {
			if(nums[i] == target)
				return true;
			else
				continue;
		}
		return false;
	}
	public static void main(String[] args) {
		int[] nums = {-1, -1, 1, 2, -1, -4};
		int i=0;
		threeSumImp(nums);
	}
}
