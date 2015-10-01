public class reverse{
	public void reverseString(String s, int idx){
		int maxIdx= idx-1;
		if (maxIdx < 0) System.out.println("\nDone");
		else {
			System.out.print(s.charAt(maxIdx));
			reverseString(s,idx-1);
		}
	}
		
	public static void main (String[] x){
		if (x.length>0){
			String str = x[0];
			reverse rs = new reverse();
			rs.reverseString(str,str.length());
		}
		else {
			System.out.println("Please Enter a String to reverse");
		}	
	}
}

