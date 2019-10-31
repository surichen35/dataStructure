package fundamental;

public class SimpleInsertSort {
	public static void display(int[] array) {
		 for(int i = 0 ; i < array.length ; i++){
	            System.out.print(array[i]+" ");
	        }
	        System.out.println();
	}
	public static int[] insertSort(int[] array) {
		if(array.length<=0)
			return null;
		for(int i=1;i<array.length;i++) {
			int j = i;
			int temp = array[i];
			//记住，temp为要插入的数据，不可改变
			//当前数据即temp，插入范围是0~i-1
			while(j>0 && temp<array[j-1])
			{
				array[j] = array[j-1];
				j--;
				//数据后移，直到不再小于
			}
			array[j] = temp;
		}
		return array;
	}
	/**
	 * 在第一轮排序中，它最多比较一次，第二轮最多比较两次，一次类推，第N轮，最多比较N-1次。因此有 1+2+3+...+N-1 = N*（N-1）/2。

　　	假设在每一轮排序发现插入点时，平均只有全体数据项的一半真的进行了比较，我们除以2得到：N*（N-1）/4。用大O表示法大致需要需要 O(N2) 时间级别。

　　	复制的次数大致等于比较的次数，但是一次复制与一次交换的时间耗时不同，所以相对于随机数据，插入排序比冒泡快一倍，比选择排序略快。
	
　　	这里需要注意的是，如果要进行逆序排列，那么每次比较和移动都会进行，这时候并不会比冒泡排序快。
	 * 
	 * **/
	public static void main(String[] args) {
		 int[] array = {4,2,8,9,5,7,6,1,3};
	        //未排序数组顺序为
	        System.out.println("未排序数组顺序为：");
	        display(array);
	        System.out.println("-----------------------");
	        array = insertSort(array);
	        System.out.println("-----------------------");
	        System.out.println("经过选择排序后的数组顺序为：");
	        display(array);
	}
}
