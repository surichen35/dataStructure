package fighting;
/**
 * @author suriChen
 * ����һ�����������ֵ�ָ��
 * base��exponent��ͬʱΪ0
 * */
public class Power {
//һ�����ָ����Ҫ�ж�����
	public double MAX_VALUE=1.7976931348623157E308;
    public double Power(double base, int exponent) {
    	if(base == 0)
    		return 0;
    	if(exponent == 0)
    		return 1;
    	double temp = 1;
    	if(exponent>0) {
    		for(int i=1;i<=exponent;i++) {
    			temp = base*temp;
    			if(temp>MAX_VALUE)
    				return -1;
    		}
    	}
    	else {
    		exponent = -exponent;
    		for(int i=1;i<=exponent;i++) {
    			temp = base*temp;
    			if(temp>MAX_VALUE)
    				return -1;
    		}
    		temp = 1.0/temp;
    	}
        return temp;
  }
    public double Power2(double base, int exponent) {
        
        //����exponent��int���͵�����������ܰ�����������0�Լ����������������
        double temp=1;
        if(exponent>0){
            for(int i=1;i<=exponent;i++){
                temp=temp*base;
                if(temp>1.7976931348623157E308){
                    System.out.println("�Ѿ�����double���͵�ȡֵ��Χ��");
                    return -1;
                }
            }
            return temp;
             
        }if(exponent<0){
            exponent=-exponent;
            for(int i=1;i<=exponent;i++){
                temp=temp*base;
                if(temp>1.7976931348623157E308){
                    System.out.println("�Ѿ�����double���͵�ȡֵ��Χ��");
                    return -1;
                }
            }
            temp=1.0/temp;
            return temp;
        }else{
            return 1;
        }
         
  }
    public static void main(String[] args) {
    	Power po = new Power();
    System.out.println(po.Power(3,3));
	}
}
