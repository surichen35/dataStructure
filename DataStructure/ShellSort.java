package fundamental;
/**
 * Ï£¶ûÅÅÐò
 * @author suriChen
 * */
import java.util.Arrays;

public class ShellSort {
public static void shellSort(int[] a) {
	
	if(a.length<=0)
		return;
	int gap = a.length/2;
	int temp;
	for(;gap>1;gap=gap/2) {
		for(int i=0;i<a.length/2;i++) {
			if(a[i]>a[i+gap])
			{
				temp = a[i+gap];
				a[i+gap] = a[i];
				a[i] = temp;
			}
		}
	}
	int tmp;
	if(gap==1)
	{
		for(int j=1;j<a.length;j++)
		{
			int k = j;
			tmp = a[k];//´ý²åÈëÊý¾Ý
			while(k>0 && tmp<a[k-1])
			{
				a[k]=a[k-1];//ºóÒÆ
				k--;
			}
			a[k] = tmp;
		}
	}
	System.out.println(Arrays.toString(a));
}
public static void main(String[] args) {
	int[] array = {4,3,5,6,2,0,9};
	shellSort(array);
	}
}
