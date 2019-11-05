package fighting;
/**
 * @author suriChen
 * ½£Ö¸offer ±äÌ¬ÌøÌ¨½×
 * */
public class JumpFloorII {
	public int JumpFloorII(int target) {
		if(target == 0||target ==1)
			return 1;
		int[] a=new int[target+1];
		a[0]=1;
		a[1]=1;
		for(int i=2;i<=target;i++)
		{
			a[i] = 2*a[i-1];
		}
		return a[target];
	}
	public static void main(String[] args) {
		JumpFloorII jump = new JumpFloorII();
		System.out.println(jump.JumpFloorII(5));
	}
}
