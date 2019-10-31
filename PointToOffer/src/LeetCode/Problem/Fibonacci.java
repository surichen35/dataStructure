package point.to.Future;
import java.util.HashMap;

/**
 * @author suriChen
 * */
public class Fibonacci {
	//µÝ¹éì³²¨ÄÇÆõ
	public static int fib(int n) {
		if(n==1||n==2)
			return 1;
		return fib(n-1)+fib(n-2);
	}
	//¼ôÖ¦
	public static int countFib(int n) {
		HashMap<Integer,Integer> map = new HashMap() ;
		for(int i=1;i<=n;i++)
		{
			map.put(i, 0);
		}
		map.put(0, 0);
		map.put(1, 1);
		map.put(2, 1);
		System.out.println(map.get(3));
		return helper(map,n);
	}
	public static int helper(HashMap map,int n) {
		if((int) map.get(n) == 0 && n>0)
			map.put(n, helper(map,n-1)+helper(map,n-2));
		return (int) map.get(n);
	}
	//DP
	public static int fibDP(int N) {
	    //vector<int> dp(N + 1, 0);
		HashMap<Integer, Integer> dp =new HashMap<Integer, Integer>();
		for(int i=3;i<=N;i++)
		{
			dp.put(i, 0);
		}
		dp.put(0, 0);
		dp.put(1, 1);
		dp.put(2, 1);
	    for (int i = 3; i <= N; i++)
	    {
	    	dp.put(i, dp.get(i-1)+dp.get(i-2));
	    }
	    return dp.get(N);
	}
	//DP ÓÅ»¯
	public static int fibDP2(int n) {
		if(n<2)
			return n;
		if(n<0)
			return 0;
		int curr = 1;
		int pre = 0;
		for(int i=0;i<n-1;i++)
		{
			int sum = curr + pre;
			pre = curr;
			curr = sum;
		}
		return curr;
	}
	public static void main(String[] args) {
		System.out.println(fibDP2(4));
	}
}
