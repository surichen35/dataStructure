package Tree;

import java.util.Arrays;

/**
 * @author suriChen
 * ��ָoffer �ؽ�������
 * ����ǰ���������������Ҫ���ؽ���ö�����
 * */
public class ReConstructTree {
	public Node reConstructBinaryTree(int[] pre,int[] in) {
		if(pre.length==0 || in.length==0)
			return null;
		Node root = new Node(pre[0]);
		for(int i=0;i<in.length;i++) {
			//�ҵ�ÿһ�����ڵ�
			if(in[i]==pre[0]) {
				//����������
				root.leftChild = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
				//����������
				root.rightChild = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
				break;
			}
		}
		return root;
	}
	
	public static void main(String[] args) {
		ReConstructTree re = new ReConstructTree();
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		re.reConstructBinaryTree(pre,in);
	}
}
