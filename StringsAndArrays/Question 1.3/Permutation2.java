import java.util.HashMap;
public class Permutation2{
        public static void main (String[] args){
		if (args.length<2)
                        System.out.println("Please enter 2 strings to compare");
                else{
                        String str1= args[0];
                        String str2= args[1];
                        if (str1.length()!=str2.length())
                                System.out.println(str1 +" is NOT a permutation of "+str2);
                        else{
				double acum1=1,acum2=1;
                                for (int i=0;i<str1.length();i++){
					char c = str1.charAt(i);
					int tmp =(int)c; 
					acum1=acum1*tmp;
					c = str2.charAt(i);
					tmp =(int)c; 
					acum2=acum2*tmp;	
                                }
				if (acum1==acum2){
                                	System.out.println(str1 +" is a permutation of "+str2);
				}
				else{
                                	System.out.println(str1 +" is NOT a permutation of "+str2);
				}

                        }
                }
        }
}
