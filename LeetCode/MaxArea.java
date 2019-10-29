package fighting;
/**
 * @author suriChen
 * LeetCode11
 * 	给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 	找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 	说明：你不能倾斜容器，且 n 的值至少为 2。
 * */
public class MaxArea {
	/**
	 * solution1 暴力解决
	 * */
	public static int maxArea(int[] height) {
		//边界判断
		if(height.length==0 || height.length==1)
			return 0;
		//定义最大面积，后续每大于这个数便覆盖
	    int maxArea = 0;
	    //最大面积等于x*y，x是横坐标，y是较矮的那一根柱子
	    int x = 0;
	    int y = 0;
	    for(int i=0;i<height.length;i++) {
	    	for(int j=i+1;j<height.length;j++) {
	    		//先获取x和y
	    		x = j-i;
	    		y = height[i]<height[j]?height[i]:height[j];
	    		maxArea = maxArea>(x*y)?maxArea : (x*y);
	    	}
	    }
	    return maxArea;
	}
	/**
	 * solution2 遍历一遍即可
	 * 	面积只与下标差距以及较小的那个数有关，考虑的是，假设从第一个到最后一个之间的面积最大为max，
	 * 	可能会出现，中间比a[0]大比a[l-1]小的数字，隔离面积>max，因此每次使较小的那个数向较大的数
	 * 	移动一步，以找出两数之间是否存在面积更大的解法，不断靠近直到两下标相遇
	 * */
	public static int maxAreaNew(int[] height) {
		//边界判断
		if(height.length==0 || height.length==1)
			return 0;
		//定义最大面积，后续每大于这个数便覆盖
	    int maxArea = 0;
	    //最大面积等于x*y，x是横坐标，y是较矮的那一根柱子
	    int x = 0;
	    int y = 0;
	    boolean flag = true;
	    int head = 0;
	    int tail = height.length-1;
	    while(head!=tail) {
	    	x = tail-head;
	    	if(height[head]<height[tail])
	    	{
	    		y = height[head++];
	    		maxArea = maxArea > x*y ? maxArea : x*y;
	    	}
	    	else {
	    		y = height[tail--];
	    		maxArea = maxArea > x*y ? maxArea : x*y;
	    	}
	    }
	    System.out.println(maxArea);
	    return maxArea;
	}
	public static void main(String[] args) {
		int[] array = {1,8,6,2,5,3,7};
		maxAreaNew(array);
	}
}
