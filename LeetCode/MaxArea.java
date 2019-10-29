package fighting;
/**
 * @author suriChen
 * LeetCode11
 * 	���� n ���Ǹ����� a1��a2��...��an��ÿ�������������е�һ���� (i, ai) ���������ڻ� n ����ֱ�ߣ���ֱ�� i �������˵�ֱ�Ϊ (i, ai) �� (i, 0)��
 * 	�ҳ����е������ߣ�ʹ�������� x �Ṳͬ���ɵ�����������������ˮ��
 * 	˵�����㲻����б�������� n ��ֵ����Ϊ 2��
 * */
public class MaxArea {
	/**
	 * solution1 �������
	 * */
	public static int maxArea(int[] height) {
		//�߽��ж�
		if(height.length==0 || height.length==1)
			return 0;
		//����������������ÿ����������㸲��
	    int maxArea = 0;
	    //����������x*y��x�Ǻ����꣬y�ǽϰ�����һ������
	    int x = 0;
	    int y = 0;
	    for(int i=0;i<height.length;i++) {
	    	for(int j=i+1;j<height.length;j++) {
	    		//�Ȼ�ȡx��y
	    		x = j-i;
	    		y = height[i]<height[j]?height[i]:height[j];
	    		maxArea = maxArea>(x*y)?maxArea : (x*y);
	    	}
	    }
	    return maxArea;
	}
	/**
	 * solution2 ����һ�鼴��
	 * 	���ֻ���±����Լ���С���Ǹ����йأ����ǵ��ǣ�����ӵ�һ�������һ��֮���������Ϊmax��
	 * 	���ܻ���֣��м��a[0]���a[l-1]С�����֣��������>max�����ÿ��ʹ��С���Ǹ�����ϴ����
	 * 	�ƶ�һ�������ҳ�����֮���Ƿ�����������Ľⷨ�����Ͽ���ֱ�����±�����
	 * */
	public static int maxAreaNew(int[] height) {
		//�߽��ж�
		if(height.length==0 || height.length==1)
			return 0;
		//����������������ÿ����������㸲��
	    int maxArea = 0;
	    //����������x*y��x�Ǻ����꣬y�ǽϰ�����һ������
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
