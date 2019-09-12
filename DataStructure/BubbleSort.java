package fundamental;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {4,7,9,2,3,1,7};
		bubbleSort(arr);
	}
	public static void bubbleSort(int[] arr) {
		if(arr.length<=0)
			return;
		int temp = 0;
//		Solution 1		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				//每次将最小的数字归位
				if(arr[j]<arr[i])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		System.out.format("第 %d 趟：\t", i);
		System.out.println(arr[i]);
		}
//		Solution 2
//		for(int i=0;i<arr.length;i++) {
//			for(int j=arr.length-1;j>i;j--) {
//				//每次将最小的数字归位
//				if(arr[j]<arr[j-1])
//				{
//					temp = arr[j-1];
//					arr[j-1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//			System.out.format("第 %d 趟：\t", i);
//			System.out.println(arr[i]);
//		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}
