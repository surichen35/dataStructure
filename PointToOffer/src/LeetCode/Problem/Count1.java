package fighting;
/**
 * @author suriChen
 * λ�������
 * m<<n��m����nλ����������nλ������ͬʱ���Ҳಹ��n��0
 * m>>n��m����nλ�������Ҳ��nλ������ͬʱ����ಹ��n��0�����mΪ���������ƶ�������ಹ��n��1
 * ��������������ȱ�ݣ�Java�ṩ��һ�����޷�����������������ƶ�ʱ���迼��ԭ���ֵķ��ţ�
 * ">>>"��������������ͬ
 * */
public class Count1 {
//ֱ�ӽ����ƶ��ж�
//ʱ�临�Ӷ�Ϊn
	public int NumberOf1(int n) {
		int count = 0;
		int flag = 1;
		while(n!=0) {
			count += n&flag;
			//�޷������������
			n = n>>>1;
		}
		return count;
    }
//ͨ��ÿ�μ�1���м���,����������������м���1�����㼸��
	public int NUmberOf1S2(int n) {
		int count =0;
		while(n!=0) {
			n = n&(n-1);
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Count1 co = new Count1();
		co.NUmberOf1S2(4);
	}
}
