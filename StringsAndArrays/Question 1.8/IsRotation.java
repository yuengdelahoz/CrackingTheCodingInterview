public class IsRotation{
	public boolean isSubstring(String str, String sub){
		if(str.indexOf(sub)!= -1) return true;
		else return false;
	}
	
	public boolean isRotated(String str1, String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		int cnt=0;
		if (len1!=len2) return false;
		else{
			char tmp = str1.charAt(0);
			for(int i=0;i<len1;i++){
				char tmp2=str2.charAt(i);
				if (tmp==tmp2){
					cnt++;
					if (cnt == len1){ 
						System.out.println("The two strings are the same"); 
						return false;}
					tmp=str1.charAt(cnt);
				}
				else{
					if(cnt > 0){
						return false;
					}
				}
			}
			String sub = str1.substring(cnt);
			return isSubstring(str2,sub);
		}
	}
	
	public static void main(String[] args){
		if (args.length != 2)System.out.println("Please enter two Strings");
		else{	
			String str1 = args[0];
			String str2 = args[1];
			boolean result = new IsRotation().isRotated(str1,str2);
			if(result) System.out.println(str2 +" is a rotation of "+ str1);
			else System.out.println(str2 +" is NOT a rotation of "+ str1);
		}
	}
}	