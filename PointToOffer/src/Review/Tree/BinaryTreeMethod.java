package Datastructer.Review.Tree;
/**
 * @author suriChen
 * 	�������ķ���
 * */
public interface BinaryTreeMethod {
	//���ҽڵ�
    public Node find(int key,Node root);
    
    //�����½ڵ�
    public boolean insert(int key,Node root);
    
    //ɾ���ڵ�
    public boolean delete(int key,Node root);
    
    //����һ�ö���������
    public Node create();
}
