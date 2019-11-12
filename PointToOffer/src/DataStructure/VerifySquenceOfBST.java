package Tree;

import java.util.ArrayList;

/**
 * @author suriChen
 * �ж�һ�������ǲ���һ�����ĺ���������
 * */
public class VerifySquenceOfBST {
	public static ArrayList<Integer> res = new ArrayList<>();
	//�ݹ��жϣ����������Ƿ���������������Ľṹ
	public static boolean judge(int[] a,int l,int r) {
		//�ﵽ������������
		if(l>=r)
			return true;
		int i=r;
		//�ҵ����������֣�������һ��С�ڸ��ڵ��������ֹͣ
        //�˴���֤���Ҳ���ȫ���ڸ��ڵ�
		while(i>l && a[i-1]>a[r])--i;
		//�ж���������Ϊ>=0����Ϊÿ�λ����������һ���֣���ȫ�Ǵ�0��ʼ��
        //�ж�����������������ִ��ڸ��ڵ㣬�򷵻ش���
        for(int j = i - 1; j >= l; --j) if(a[j] > a[r]) return false;
        return judge(a, l, i - 1) && (judge(a, i, r - 1));
	}
	
	public static boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence.length<=0)
			return false;
        return judge(sequence,0,sequence.length-1);
    }
//	//�������
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
