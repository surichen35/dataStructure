package Datastructer.Review;

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
			//��ס��tempΪҪ��������ݣ����ɸı�
			//��ǰ���ݼ�temp�����뷶Χ��0~i-1
			while(j>0 && temp<array[j-1])
			{
				array[j] = array[j-1];
				j--;
				//���ݺ��ƣ�ֱ������С��
			}
			array[j] = temp;
		}
		return array;
	}
	/**
	 * �ڵ�һ�������У������Ƚ�һ�Σ��ڶ������Ƚ����Σ�һ�����ƣ���N�֣����Ƚ�N-1�Ρ������ 1+2+3+...+N-1 = N*��N-1��/2��

����	������ÿһ�������ֲ����ʱ��ƽ��ֻ��ȫ���������һ����Ľ����˱Ƚϣ����ǳ���2�õ���N*��N-1��/4���ô�O��ʾ��������Ҫ��Ҫ O(N2) ʱ�伶��

����	���ƵĴ������µ��ڱȽϵĴ���������һ�θ�����һ�ν�����ʱ���ʱ��ͬ�����������������ݣ����������ð�ݿ�һ������ѡ�������Կ졣
	
����	������Ҫע����ǣ����Ҫ�����������У���ôÿ�αȽϺ��ƶ�������У���ʱ�򲢲����ð������졣
	 * 
	 * **/
	public static void main(String[] args) {
		 int[] array = {4,2,8,9,5,7,6,1,3};
	        //δ��������˳��Ϊ
	        System.out.println("δ��������˳��Ϊ��");
	        display(array);
	        System.out.println("-----------------------");
	        array = insertSort(array);
	        System.out.println("-----------------------");
	        System.out.println("����ѡ������������˳��Ϊ��");
	        display(array);
	}
}
