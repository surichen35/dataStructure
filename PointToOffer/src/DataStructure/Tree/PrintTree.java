package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author suriChen
 * 从上到下打印二叉树，同层从左到右打印
 * */
public class PrintTree {
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null)
			return res;
		Queue<TreeNode> tempQueue = new LinkedList<TreeNode>();
		tempQueue.offer(root);
//将根节点先放入队列中，作为队头取出，如果该节点的左右子节点不为0，将左右子节点放入队尾
//第二次取出队头，即根节点的左子节点，作为新根节点，再进行上述操作
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
