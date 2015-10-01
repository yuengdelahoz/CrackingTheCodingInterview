import java.util.HashMap;
public class Q1{
	public static void main (String[] args){
		if (args.length>0){
			String str = args[0];
			HashMap table = new HashMap();
			int count =0;
			for (int i = 0; i < str.length();i++){
				char c = str.charAt(i);
				System.out.print(c +"\t");
				if (table.put(c,c)!=null){
					count++;
					break;
				}	 
			}
			if (count==0) System.out.println("All characters are unique");
			else System.out.println("Not all characters are unique");
		}
		else System.out.println("Please enter a valid string to determine if all characters are unique");
	}
}
