public class Q92{
	String[][] A;
	int [][] B;
	public Q92(String[][] A){
		this.A = A;
		B = new int[A.length][A[0].length];
	}
	public int move( int x, int y){
		if (x>A.length-1 || y > A[0].length-1) return 0;
		if (A[x][y]=="F") return 1;
		if (A[x][y]=="X") return 0;
		if (B[x][y] !=0) return B[x][y];
		B[x][y]= move(x+1,y)+move (x,y+1);
		return B[x][y];
	}
	public static void main (String[] args){
		String[][] A = new String[11][11];
		for (int i=0; i<A.length; i++)
			for (int j=0; j<A[0].length; j++)
				A[i][j] = "A";
		A[10][10] = "F";
		for (int i=0; i<A.length; i++){
			for (int j=0; j<A[0].length; j++)
				System.out.print(A[i][j]+ "\t");
			System.out.println();
		}
		Q92 robot = new Q92(A);
		System.out.println(robot.move(0,0));
	}
}
