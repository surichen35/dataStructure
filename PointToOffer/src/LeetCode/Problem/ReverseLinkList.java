package fighting;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author suriChen
 * */
public class ReverseLinkList {
	//创建链表
	public static LinkNode createLinkList(LinkNode head) {
		//头插法
		for(int i=5;i>0;i--)
		{
			LinkNode node = new LinkNode(i);
			node.next = head;
			head = node;
		}
		LinkNode p=head;
		int i=1;
		while(p!=null) {
			//System.out.println("这是第" + i++ +"个结点："+p.data);
			p = p.next;
		}
		
		//System.out.println(head.data);
		//尾插法
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
//		//尾插法先要确定头结点是否为空，空的话先将第一个结点给头结点
        return head;
	}
/**
 * 使用递归进行链表翻转
 * 要注意链表断裂的问题
 * 理解以下两个语句：（记住递归从尾到头）
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
 * 使用栈进行链表翻转
 * 在出栈时将结点连接起来
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
 * 使用迭代方法进行反转
 * @return 
 * */
	 public static LinkNode reverseBynormal(LinkNode head) {
		 if(head==null || head.next==null)
			 return head;
		 //不需要定义新表头，直接迭代至链表尾部，当前结点则为新链表表头
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
