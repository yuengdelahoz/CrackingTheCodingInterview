public class Q51{
	public static int insertMinN(int N,int M, int i, int j){
		int mask = 1 << (j-i+1);
		mask = mask - 1;
		mask = mask << i;
		N = N & ~mask;
		M = M << i;
		return N|M;
	}
	public static void main (String[] args){
		int N = 0b10000011001;
		int M = 0b10011;
		System.out.println(Integer.toBinaryString(insertMinN(N,M,2,6)));
	}
}