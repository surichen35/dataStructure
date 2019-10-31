package Datastructer.Review;

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
			//�轫min����Ϊ��ǰ�ĵ�һ��Ԫ�أ����������ж�����
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[min])
					min = j;
					//����С�����±��Ϊmin������ÿ�˽���
			}
			if(min != i)
			{
				int temp = array[min];
				array[min] = array[i];
				array[i] = temp;
				//����������ǰ��С�����ŵ���ǰ��
			}
		}
		return array;
		/**
		 * ѡ���������ཻ��N��
		 * �Ƚϴ�����n-1,n-2,n-3....��n(n-1)/2
		 * ʱ�临�Ӷ�ΪO(n^2)
		 * */
	}
	
	public static void main(String[] args){
        int[] array = {4,2,8,9,5,7,6,1,3};
        //δ��������˳��Ϊ
        System.out.println("δ��������˳��Ϊ��");
        display(array);
        System.out.println("-----------------------");
        array = selectSort(array);
        System.out.println("-----------------------");
        System.out.println("����ѡ������������˳��Ϊ��");
        display(array);
    }
}
