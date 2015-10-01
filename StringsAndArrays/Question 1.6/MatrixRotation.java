import java.util.Random;
public class MatrixRotation{
	public int[][] RotateMatrix(int[][] A){
		int ref = A.length-1;
		int L = A.length/2;
		
		for(int i=0;i<L;i++){
			for(int j=i;j<ref-i;j++){
				
				int tmp = A[i][j];

				//Swap Top Row with Left Column
				A[i][j] = A[ref-j][i];

				//Swap Left Column with Bottom Row
				A[ref-j][i] = A[ref-i][ref-j];
			
				//Swap Bottom Row with Right Column
				A[ref-i][ref-j] = A[j][ref-i];

				//Swap Right Column with Top Row
				A[j][ref-i] = tmp;

			}
		}
		return A;	
	}

	public static void main (String[] args){
		Random rnd = new Random();
		int size = rnd.nextInt(7)+4;
		int[][] A = new int [size][size];
		int cnt=1;
		System.out.println("Original Matrix");
		for (int i=0;i<size;i++){
			System.out.println();
			for (int j=0;j<size;j++){
				A[i][j]=cnt++;
				System.out.print(A[i][j] + "\t");
			}
		}
		MatrixRotation mr = new MatrixRotation();
		int[][] B = mr.RotateMatrix(A);		
		System.out.println("\n\nRotated Matrix");
		for (int i=0;i<size;i++){
			System.out.println();
			for (int j=0;j<size;j++){
				System.out.print(B[i][j] + "\t");
			}
		}
}
}