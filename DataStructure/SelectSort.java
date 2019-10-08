package fundamental;

public class SelectSort {
	 public static void display(int[] array){
	        for(int i = 0 ; i < array.length ; i++){
	            System.out.print(array[i]+" ");
	        }
	        System.out.println();
	    }
	 
	public static int[] selectSort(int[] array) {
		if(array.length<=0)
			return null;
		for(int i=0;i<array.length-1;i++)
		{
			int min = i;
			//需将min设置为当前的第一个元素，后续才有判断意义
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[min])
					min = j;
					//将较小的数下标存为min，无需每趟交换
			}
			if(min != i)
			{
				int temp = array[min];
				array[min] = array[i];
				array[i] = temp;
				//交换，将当前最小的数放到最前面
			}
		}
		return array;
	}
	
	public static void main(String[] args){
        int[] array = {4,2,8,9,5,7,6,1,3};
        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        display(array);
        System.out.println("-----------------------");
        array = selectSort(array);
        System.out.println("-----------------------");
        System.out.println("经过选择排序后的数组顺序为：");
        display(array);
    }
}
