package Tree;

import java.util.ArrayList;

/**
 * @author suriChen
 * 判断一个数组是不是一个树的后序遍历结果
 * */
public class VerifySquenceOfBST {
	public static ArrayList<Integer> res = new ArrayList<>();
	//递归判断，左右子树是否都满足二叉搜索树的结构
	public static boolean judge(int[] a,int l,int r) {
		//达到了搜索结束点
		if(l>=r)
			return true;
		int i=r;
		//找到左子树部分，遇到第一个小于根节点的数字则停止
        //此处保证了右部分全大于根节点
		while(i>l && a[i-1]>a[r])--i;
		//判断条件不能为>=0，因为每次划分是数组的一部分，不全是从0开始的
        //判断左子树，如果有数字大于根节点，则返回错误
        for(int j = i - 1; j >= l; --j) if(a[j] > a[r]) return false;
        return judge(a, l, i - 1) && (judge(a, i, r - 1));
	}
	
	public static boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence.length<=0)
			return false;
        return judge(sequence,0,sequence.length-1);
    }
//	//后序遍历
//	public static void LRD(TreeNode root) {
//		if(root==null)
//			return;
//		if(root.left!=null)
//			{
//				LRD(root.left);
//			}
//		if(root.right!=null)
//			{
//				LRD(root.right);
//			}
//		res.add(root.data);
//	}
	public static void main(String[] args) {
//		TreeNode root = new TreeNode(4);
//		root.left = new TreeNode(3);
//		root.right = new TreeNode(6);
//		root.left.left = new TreeNode(1);
//		root.left.right = new TreeNode(3);
//		root.right.left = new TreeNode(6);
//		root.right.right = new TreeNode(7);
//		LRD(root);
		int[] temp= {0,2,1,3,7,5,6,4};
		System.out.println(VerifySquenceOfBST(temp));
		//System.out.println(res.toString());
		
	}
}
