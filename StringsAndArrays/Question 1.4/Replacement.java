public class Replacement{
	public String Replace (String str){
		char[] charArray = str.toCharArray();
		int len = str.length();
		int counter=0;
		boolean flag=true;
		int spaces=0;
		int k=0;
		for(int i=len-1;i>=0;i--){
			System.out.println(charArray[i]);
			if(charArray[i]==' '){
				if (flag) counter++;
				else{
					charArray[i+counter-2]='%';
					charArray[i+counter-1]='2';
					charArray[i+counter]='0';
					counter-=2;
				}
			}
			else{	
				if (k==0){
					flag=false;
					k=1;
				}
					if(counter==1)
					charArray[i]=charArray[i];
					else
					charArray[i+counter]=charArray[i];
			}
		}
		String sstr = new String (charArray);
		return sstr;
	}
	public static void main(String[] args){
		Replacement swp = new Replacement();
		String str = args[0];
		String sstr = swp.Replace(str);
		System.out.println("New String "+sstr);
	}
}
