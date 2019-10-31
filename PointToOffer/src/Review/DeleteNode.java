package Datastructer.Review;
/**
 * @author suriChen
 * 	给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

	示例：
	
	给定一个链表: 1->2->3->4->5, 和 n = 2.
	
	当删除了倒数第二个节点后，链表变为 1->2->3->5.
	说明：
	
	给定的 n 保证是有效的。
	
	进阶：
	
	你能尝试使用一趟扫描实现吗？
 * 
 * */
public class DeleteNode {
	public static LinkNode deleteTheNode(LinkNode head,int n) {
		/**
		 * 思路1：两个指针，先找到倒数第N个结点，再将其从链表中断开
		 * 边界问题:1.n比链表长度更长；2.链表为空或者单结点（与前一条可合并）
		 * */
		System.out.println(head.next);
		LinkNode p1 = head;
		LinkNode p2 = head;
		int count = 0;
		int flag = n;
		while(p1!=null)//做一次遍历
		{
			p1 = p1.next;
			count++;
			if(flag<0) {//找到倒数第n个结点的前一个结点，晚一步走
				p2 = p2.next;
			}
			flag--;
		}
		if(n>count)
			{
				System.out.println("n大于链表长度");
				return null;
			}
		if(n == 1)//要删除的结点为最后一个结点
			p2.next = null;
		else if(count == n)
			head = head.next;
		else
			p2.next = p2.next.next;
		System.out.println(head==null);
		return head;
	}
	public static void main(String[] args) {
		LinkNode head = new LinkNode(1);
		for(int i=5;i>=1;i--) {
			LinkNode p = new LinkNode(i);
			p.next = head;
			head = p;
		}
		LinkNode newHead =deleteTheNode(head, 1);
		System.out.println(newHead);
	}
}
