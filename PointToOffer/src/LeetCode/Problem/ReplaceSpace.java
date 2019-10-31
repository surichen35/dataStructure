package point.to.Future;
/**
 * @author suriChen
 * */
public class ReplaceSpace {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("We Are Happy. ");
		System.out.println(replace(str));
		}

	public static String replace(StringBuffer str) {
		if(str.equals("")||str.length()<=0)
			return null;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				str.replace(i, i+1, "%20");
			}
		}
		return str.toString();
	}
	public static String replaceStrSpace(StringBuffer str) {
		int spaceLength=0;
    	for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
                spaceLength++;
        }
    	int newIndex = str.length()+spaceLength*2-1;
	    int oldIndex = str.length()-1;
	    int newLength = str.length()+spaceLength*2;
	    str.setLength(newLength);
	    while(oldIndex<newLength && oldIndex>=0)
	    {
	    	if(str.charAt(oldIndex)==' ')
        	{
        		str.setCharAt(newIndex--, '0');
        		str.setCharAt(newIndex--, '2');
        		str.setCharAt(newIndex--, '%');
        		oldIndex--;
        	}
        	else {
        		str.setCharAt(newIndex--, str.charAt(oldIndex--));
        	}
	    }
	    return str.toString();
	}
	
	
	public static String replaceStr(String str) {
		int spaceLength=0;
    	for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
                spaceLength++;
        }
	    int j = str.length()+spaceLength*2-1;
	    int i = str.length()-1;
	    char[] arr = new char[j+1];
	        while(i>=0 && j>=0)
	        	if(str.charAt(i)==' ')
	        	{
	        		arr[j] = '%';
	        		arr[j-1] = '0';
	        		arr[j-2] = '2';
	        		j-=3;
	        		i--;
	        	}
	        	else {
	        		arr[j] = str.charAt(i);
	        		i--;
	        		j--;
	        	}
	        String n = String.valueOf(arr);
	        return String.valueOf(arr);
	}
}
