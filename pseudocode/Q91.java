public class Q91{
	public int countSteps(int n){
		if (n==0) return 0;
		if (n==1) return 1;
		if (n==2) return 2;
		if (n==3) return 4;
		return countSteps(n-1)+countSteps(n-2)+countSteps(n-3);
	}
	int[] A = new int[10000000];
	public int DcountSteps(int n){
		if (n==0) return 0;
		if (n==1) return 1;
		if (n==2) return 2;
		if (n==3) return 4;
		if (A[n] !=0) return A[n];
		A[n] = DcountSteps(n-1)+DcountSteps(n-2)+DcountSteps(n-3);
		return A[n];
	}
	public static void main (String[] args){
		int n = 4;
		Q91 count = new Q91();
		System.out.println(count.DcountSteps(n));
	}
}
