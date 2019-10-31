package Datastructer.Review.Tree;
/**
 * @author suriChen
 * 	���ڵ���
 * */
public class Node {
	//�ڵ�����
	public int data;
	//��ڵ�
	public Node leftChild;
	//�ҽڵ�
	public Node rightChild;
	
	public Node(int data) {
		this.data = data;
	}
	//��ӡ��������ӡ��ǰ�ڵ��ֵ
	public void display() {
		System.out.println(data);
	}
}
