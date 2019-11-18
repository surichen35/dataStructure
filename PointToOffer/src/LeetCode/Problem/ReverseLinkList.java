package fighting;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author suriChen
 * */
public class ReverseLinkList {
	//��������
	public static LinkNode createLinkList(LinkNode head) {
		//ͷ�巨
		for(int i=5;i>0;i--)
		{
			LinkNode node = new LinkNode(i);
			node.next = head;
			head = node;
		}
		LinkNode p=head;
		int i=1;
		while(p!=null) {
			//System.out.println("���ǵ�" + i++ +"����㣺"+p.data);
			p = p.next;
		}
		
		//System.out.println(head.data);
		//β�巨
//		LinkNode p=head;
//		head = p;
//		for(int i=0;i<4;i++) {
//			LinkNode n=new LinkNode();
//			n.data = i;
//			if(head == null)
//			{
//				n.next = head;
//				head = n;
//			}
//			else {
//				p.next = n;
//				p = p.next;
//			}
//		}
//		System.out.println(head.next.data);
//		//β�巨��Ҫȷ��ͷ����Ƿ�Ϊ�գ��յĻ��Ƚ���һ������ͷ���
        return head;
	}
/**
 * ʹ�õݹ��������ת
 * Ҫע��������ѵ�����
 * �������������䣺����ס�ݹ��β��ͷ��
 * listNode.next.next = listNode;
 * listNode.next = null;
 * */
	public static LinkNode reverseLinkList(LinkNode listNode) {
		if(listNode.next == null || listNode == null)
			return listNode;
		LinkNode newHead = reverseLinkList(listNode.next);
		listNode.next.next = listNode;
		listNode.next = null;
		return newHead;
	}
/**
 * ʹ��ջ��������ת
 * �ڳ�ջʱ�������������
 * */
	 public static LinkNode reverseListByStack(LinkNode head) {
		 if(head == null || head.next==null)
		 		return head;
		 	Stack<LinkNode> stack = new Stack<LinkNode>();
		 	while(head!=null) {
		 		stack.push(head);
		 		head = head.next;
		 	}
		 	LinkNode newHead = new LinkNode(0);
		 	LinkNode cur = stack.pop();
		 	newHead = cur;
		 	while(!stack.isEmpty()) {
		 		//LinkNode temp = stack.pop();
		 		cur.next =  stack.pop();
		 		cur = cur.next;
		 	}
		 	cur.next = null;
		 	return newHead;
		}
/**
 * ʹ�õ����������з�ת
 * @return 
 * */
	 public static LinkNode reverseBynormal(LinkNode head) {
		 if(head==null || head.next==null)
			 return head;
		 //����Ҫ�����±�ͷ��ֱ�ӵ���������β������ǰ�����Ϊ�������ͷ
		 LinkNode cur = new LinkNode(head.data);
		 LinkNode pre = head.next;
		 cur.next = null;
		 while(pre!=null) {
			LinkNode temp = new LinkNode(pre.data);
			temp.next = cur;
			cur = temp;
			pre = pre.next;
		 }
		 return cur;
	 }
	 public static ArrayList<Integer> printListFromTailToHead(LinkNode listNode) {
		 Stack stack=new Stack();
		 while(listNode.next!=null)
		 {
			 stack.push(listNode.data);
			 listNode = listNode.next;
		 }
		 ArrayList<Integer> res = new ArrayList();
		 while(!stack.empty()) {
			res.add(Integer.parseInt(stack.pop().toString())); 
		 }
		 System.out.println(res);
		 return res;
	  }
	public static void main(String[] args) {
		LinkNode head = null;
		head = createLinkList(head);
		System.out.println(reverseBynormal(head).data);
	}
}
