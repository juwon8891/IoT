
public class RemovesBarOne {

	public static void main(String[] args) {
		String str = "990208-2012752";
		
		StringBuilder sbuf = new StringBuilder(str);
		
		for(int i=0; i<sbuf.length(); i++)
		{
			if(sbuf.charAt(i) == '-')
			{
				sbuf.deleteCharAt(i);
				break;
			}
		}
		str=sbuf.toString();
		System.out.println(str);
	}

}
