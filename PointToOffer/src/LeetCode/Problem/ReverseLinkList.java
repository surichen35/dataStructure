package point.to.Future;

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
		for(int i=6;i>0;i--)
		{
			LinkNode node = new LinkNode();
			node.data = i;
			node.next = head;
			head = node;
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
	public static LinkNode reverseLinkList(LinkNode listNode) {
		if(listNode.next==null)
			return listNode;
		return reverseLinkList(listNode.next);
	}
	 public static ArrayList<Integer> printListFromTailToHead(LinkNode listNode) {
		 Stack stack=new Stack();
		 while(listNode.next!=null)
		 {
			 stack.push(listNode.data);
			 System.out.println(listNode.data);
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
		LinkNode head = new LinkNode();
		head = createLinkList(head);
		//LinkNode reverse = new LinkNode();
		//reverse = reverseLinkList(head);
		printListFromTailToHead(head);
	}
}
