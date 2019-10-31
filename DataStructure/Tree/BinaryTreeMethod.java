package Tree;
/**
 * @author suriChen
 * 	二叉树的方法
 * */
public interface BinaryTreeMethod {
	//查找节点
    public Node find(int key,Node root);
    
    //插入新节点
    public boolean insert(int key,Node root);
    
    //删除节点
    public boolean delete(int key,Node root);
    
    //创建一棵二叉搜索树
    public Node create();
}
