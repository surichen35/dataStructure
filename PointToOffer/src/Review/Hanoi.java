package Datastructer.Review;
/**
 * ��ŵ������
 * @param dish ���Ӹ���(Ҳ��ʾ����)
 * @param from ��ʼ����
 * @param temp �н�����
 * @param to   Ŀ������
 */
public class Hanoi {
	public static void move(int dish,String from,String temp,String to) {
		if(dish==1)
		{
	        System.out.println("������"+dish+"������"+from+"�ƶ���Ŀ������"+to);
	    }else{
	        move(dish-1,from,to,temp);//AΪ��ʼ������BΪĿ��������CΪ�н�����
	        System.out.println("������"+dish+"������"+from+"�ƶ���Ŀ������"+to);
	        move(dish-1,temp,from,to);//BΪ��ʼ������CΪĿ��������AΪ�н�����
	    }
	}
	public static void main(String[] args) {
		move(3,"A","B","C");
	}
}
