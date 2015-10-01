import java.util.HashMap;
public class Permutation{
	public static void main (String[] args){
		if (args.length <2)
			System.out.println("Please enter 2 strings to compare);
		else{
			String str1= args[0];
			String str2= args[1];
			if (str1.length()!=str2.length())
				System.out.println(str1 +" is not a permutation of "+str2);
			else{
				HashMap map = new HashMap();
				for (int i=0;i<str1.length();i++){
					char tmp = str1.charAt(i);
					map.put(tmp,tmp);
				}

				for (int i=0;i<str1.length();i++){
					char tmp = str2.charAt(i);
					map.put(tmp,tmp);
				}
			}
		}
	}
}
