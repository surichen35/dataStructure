package Datastructer.Review.Tree;
/**
 * @author suriChen
 * Review BinaryTree
 * CRUD
 *	����������ɾ�Ĳ�
 * */
public class BinaryTree implements BinaryTreeMethod {
	//����
	@Override
	public Node find(int key, Node root) {
		Node current = root;
		while(current!=null) {
			if(key>current.data) {
				current = current.rightChild;
			}
			else if(key<current.data) {
				current = current.leftChild;
			}
			else {
				return current;
			}
		}
		return null;
	}
	
	//����ڵ�
	@Override
	public boolean insert(int key, Node root) {
		Node current = root;
		Node newNode = new Node(key);
		while(current != null) {
			Node parentNode = current;
			if(key<current.data) {
				current = current.leftChild;
				if(current == null)
				{
					parentNode.leftChild = newNode;
					return true;
				}
			}else if(key>current.data) {
				current = current.rightChild;
				if(current == null)
				{
					parentNode.rightChild = newNode;
					return true;
				}
			}else {
				return true;
			}
		}
		return false;
	}
	
	//ɾ�����
	@Override
	public boolean delete(int key, Node root) {
		// TODO Auto-generated method stub
		return false;
	}
	
	//����һ����
	@Override
	public Node create() {
		Node root = null;
		Node leftChild = null;
		Node rightChild = null;
		root.data = 10;
		root.display();
		leftChild.data = 8;
		rightChild.data = 9;
		root.leftChild = leftChild;
		root.rightChild = rightChild;
//		for(int i=9;i>=0;i--) {
//			temp.data = i;
//			if(i%2==0)
//			{
//				rightChild = temp;
//				root.rightChild = rightChild;
//			}
//			else {
//				leftChild = temp;
//				root.leftChild = leftChild;
//			}
//			
//		}
		return root;
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Node root = tree.find(1,null);
	}
	
	
}