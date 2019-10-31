package Tree;
/**
 * @author suriChen
 * 	树节点类
 * */
public class Node {
	//节点数据
	public int data;
	//左节点
	public Node leftChild;
	//右节点
	public Node rightChild;
	
	public Node(int data) {
		this.data = data;
	}
	//打印函数，打印当前节点的值
	public void display() {
		System.out.println(data);
	}
}
