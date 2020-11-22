
public class RemovBarTwo {

	public static void main(String[] args) {
	String str = "990208-2012752";
	StringBuilder subf = new StringBuilder(str);
			
	int idx = subf.lastIndexOf("-");
	System.out.println(idx);
	
	if(idx != -1)
		subf.deleteCharAt(idx);
	
	str=subf.toString();
	System.out.println(str);

	}

}
