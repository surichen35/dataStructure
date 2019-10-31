package Datastructer.Review;

import java.util.Arrays;

/**
 * @author suriChen
 * */
public class MergeSort {

	//�ϲ�������������
	public static int[] mergeTwoArray(int[] A,int[] B) {
		int[] temp = new int[A.length+B.length];
		int pA = 0;
		int pB = 0;
		int pC = 0;
		while(pA<A.length&&pB<B.length) {
			if(A[pA]<B[pB])
				temp[pC++] = A[pA++];
			else
				temp[pC++] = B[pB++];
		}
		while(pA<A.length)
			temp[pC++] = A[pA++];
		while(pB<B.length)
			temp[pC++] = B[pB++];
		for(int i=0;i<temp.length;i++)
			System.out.println(temp[i]);
		return temp;
	}
	//�鲢����
	public static int[] mergeSort(int start,int last,int[] a) {
		if(start<last) {
			int mid = (start+last)/2;
			//�鲢���
			mergeSort(start,mid,a);
			System.out.println("�鲢���"+"from"+start+"to"+last);
			//�ұ�
			mergeSort(mid+1,last,a);
			System.out.println("�鲢�ұ�"+"from"+start+"to"+last);
			//�ϲ���������
			merge(start,mid,last,a);
		}
		System.out.println(Arrays.toString(a));
		return a;
	}
	//�ϲ���������
	public static void merge(int start,int mid,int last,int[] a) {
		int l = start;
		int r = mid+1;
		int[] temp = new int[last-start+1];
		int i=0;
		while(l<=mid && r<=last) {
			if(a[l]<a[r])
				temp[i++] = a[l++];
			else
				temp[i++] = a[r++];
		}
		while(l<=mid)
			temp[i++] = a[l++];
		while(r<=last)
			temp[i++] = a[r++];
		for(int j=0;j<temp.length;j++)
			a[j+start] = temp[j];
	}
	
	public static void main(String[] args) {
		int[] arrA = {2,4,6,7,10,17};
		int[] arrB = {1,3,5,8};
		//mergeTwoArray(arrA,arrB);
		int[] array = {7,6,2,5,1};
		array = mergeSort(0,4,array);
	}
}
