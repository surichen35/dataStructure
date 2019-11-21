package fighting;

import java.util.HashMap;

/**
 *	���� k ����ֵ��Ӳ�ң���ֵ�ֱ�Ϊ c1, c2 ... ck���ٸ�һ���ܽ�� n��
 * 	����������Ҫ��öӲ�Ҵճ��������������ܴճ�����ش� -1 
 * @author suriChen
 * */
public class CollectCoin {
	static int INT_MAX = (int) Math.pow(2, 31);
	public static int getCount(int[] coins, int money) {
		if(money==0)return 0;
		int ans = INT_MAX;
		for(int coin : coins) {
			//��ֵ���ڽ��
			if(money-coin<0)continue;
			int subMoney = getCount(coins,money-coin);
			//�������޽⣨Ŀ�����ȥ��ǰ��
			if(subMoney == -1)continue;
			//��ÿһ����ȡ���ϴ�����С��
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
			//��ÿһ����ȡ���ϴ�����С��
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
