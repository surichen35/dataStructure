package Tree;
/**
 * @author suriChen
 * LeetCode 16
 * 合并K个有序链表
 * */
import java.util.ArrayList;

import fighting.LinkNode;


public class MergeLists {
//solution 2分治法
	public LinkNode mergeKLists2(LinkNode[] lists) {
        if(lists.length==0)
        	return null;
        if(lists.length==1)
        	return lists[0];
        
        return lists[lists.length-1];
    }
	public LinkNode mergeHelper(LinkNode[] lists,int start,int end) {
		if(start==end)
			return null;
		int mid = (end+start)/2;
		LinkNode l1 = mergeHelper(lists,start,mid);
		LinkNode l2 = mergeHelper(lists,mid+1,end);
		return merge(l1,l2);
	}
	
//solution1 O(n^2)
	public LinkNode mergeKLists(LinkNode[] lists) {
        if(lists.length==0 || lists.length==1)
        return lists[0];
        for(int i=0;i<lists.length-1;i++){
//合并前两个，将结果存在后一个中
            lists[i+1] = merge(lists[i],lists[i+1]);
        }
        return lists[lists.length-1];
    }
	public LinkNode merge(LinkNode l1,LinkNode l2) {
		if(l1==null && l2!=null)
			return l2;
		if(l1!=null && l2==null)
			return l1;
		LinkNode newHead = new LinkNode(0);
		LinkNode temp = newHead;
		while(l1!=null && l2!=null) {
			if(l1.data<l2.data) {
				temp.next = l1;
				l1 = l1.next;
			}
			else {
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}
		temp.next = l1==null?l2:l1;
		return newHead.next;
	}
	public static void main(String[] args) {
		ArrayList<TreeNode> list = new ArrayList<>();
	}
}
