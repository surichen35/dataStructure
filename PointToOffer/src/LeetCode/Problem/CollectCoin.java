package fighting;

import java.util.HashMap;

/**
 *	给你 k 种面值的硬币，面值分别为 c1, c2 ... ck，再给一个总金额 n，
 * 	问你最少需要几枚硬币凑出这个金额，如果不可能凑出，则回答 -1 
 * @author suriChen
 * */
public class CollectCoin {
	static int INT_MAX = (int) Math.pow(2, 31);
	public static int getCount(int[] coins, int money) {
		if(money==0)return 0;
		int ans = INT_MAX;
		for(int coin : coins) {
			//面值大于金额
			if(money-coin<0)continue;
			int subMoney = getCount(coins,money-coin);
			//子问题无解（目标金额减去当前金额）
			if(subMoney == -1)continue;
			//对每一个金额都取集合次数最小的
			ans = Math.min(ans,subMoney+1);
		}
		return ans == INT_MAX?-1:ans;
	}
	public static int helper(int[] coins,int target,HashMap<Integer, Integer> set) {
		if(target == 0)return 0;
		int ans = INT_MAX;
		if(set.get(target)!=-2)return set.get(target);
		for(int coin : coins) {
			if(target - coin<0)continue;
			int subMoney = helper(coins, target, set);
			if(subMoney == -1)continue;
			//对每一个金额都取集合次数最小的
			ans = Math.min(ans,subMoney+1);
		}
		set.put(target, ans==INT_MAX?-1:ans);
		return set.get(target);
	}
	public static int getCountRecord(int[] coins,int target) {
		HashMap<Integer,Integer> map = new HashMap();
		for(int i=0;i<target;i++) {
			map.put(i, -2);
		}
		return helper(coins,target,map);
		
	}
	public static int getCountDP(int[] coins, int target) {
		HashMap<Integer,Integer> map = new HashMap();
		map.put(0, 0);
		for(int i=1;i<=target;i++) {
			map.put(i, INT_MAX);
		}
		for(int i=0;i<map.size();i++) {
			for(int coin:coins)
			{
				if(i - coin <0)continue;
				map.put(i, Math.min(map.get(i), 1+map.get(i-coin)));
			}
		}
		return map.get(target) == INT_MAX?-1:map.get(target);
	}
	public static void main(String[] args) {
		
	}
}
