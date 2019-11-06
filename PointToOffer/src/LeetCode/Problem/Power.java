package fighting;
/**
 * @author suriChen
 * 计算一个浮点型数字的指数
 * base与exponent不同时为0
 * */
public class Power {
//一般计算指数都要判定界限
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
        
        //由于exponent是int类型的整数，则可能包含正整数、0以及负整数三种情况。
        double temp=1;
        if(exponent>0){
            for(int i=1;i<=exponent;i++){
                temp=temp*base;
                if(temp>1.7976931348623157E308){
                    System.out.println("已经超出double类型的取值范围。");
                    return -1;
                }
            }
            return temp;
             
        }if(exponent<0){
            exponent=-exponent;
            for(int i=1;i<=exponent;i++){
                temp=temp*base;
                if(temp>1.7976931348623157E308){
                    System.out.println("已经超出double类型的取值范围。");
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
