public class Compression{
	public String Compress(String str){
		StringBuffer buffer = new StringBuffer();
		int len = str.length();
		int counter = 1;
		for(int i=0;i<len-1;i++){
			char tmp = str.charAt(i);
			char tmp2 = str.charAt(i+1);
			if (tmp==tmp2){
				counter++;
				if ((i+1)==len-1){
					buffer.append(tmp);
					buffer.append(counter);
				}
			}
			else{
				buffer.append(tmp);
				buffer.append(counter);
				counter=1;
				if (i+1==len-1){
					char tmp3 = str.charAt(i+1);
					buffer.append(tmp3);
					buffer.append(counter);
				}
			}

		}
				
		String rt = buffer.length()<len?buffer.toString():str;
		return buffer.toString();
		
	}
	public static void main (String[] args){
		if (args.length<=0) System.out.println("Enter a valid String");
		else{
			String msg = args[0];
			Compression cs = new Compression();
			String pck = cs.Compress(msg);
			System.out.println(pck);
		}
	}
}
