package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author suriChen
 * ���ϵ��´�ӡ��������ͬ������Ҵ�ӡ
 * */
public class PrintTree {
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null)
			return res;
		Queue<TreeNode> tempQueue = new LinkedList<TreeNode>();
		tempQueue.offer(root);
//�����ڵ��ȷ�������У���Ϊ��ͷȡ��������ýڵ�������ӽڵ㲻Ϊ0���������ӽڵ�����β
//�ڶ���ȡ����ͷ�������ڵ�����ӽڵ㣬��Ϊ�¸��ڵ㣬�ٽ�����������
		while(!tempQueue.isEmpty()) {
			TreeNode tempRoot = new TreeNode(0);
			tempRoot = tempQueue.poll();
			res.add(tempRoot.data);
			if(tempRoot.left!=null)
				tempQueue.offer(tempRoot.left);
			if(tempRoot.right!=null)
				tempQueue.offer(tempRoot.right);
		}
		System.out.println(res.toString());
		return res;
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		//root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		PrintFromTopToBottom(null);
		
	}

}
