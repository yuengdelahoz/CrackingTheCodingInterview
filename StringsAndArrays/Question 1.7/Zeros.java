import java.util.Random;
public class Zeros{
	public int[][] Xero(int [][] A){
		int rows = A.length;
		int cols = A[0].length;
		boolean [] visited = new boolean[cols];
		for(int i=0;i<rows;i++){
			int k=0;
			for(int j=0;j<cols;j++){
				if(A[i][j]==0){
					visited[j]=true;
					if(k==0){
						k=1;
					}
				}
			}
			if(k==1){
				k=0;
				for(int m=0;m<cols;m++){
					A[i][m]=0;
				}
			}
		}
		for(int i=0;i<cols;i++){
			if(visited[i]){
				for(int m=0;m<rows;m++){
						A[m][i]=0;
				}
			}
		}
		return A;
	}

	public static void main (String[] args){
		Random rnd = new Random();
		int rows = rnd.nextInt(3)+3;
		int cols = rnd.nextInt(2)+4;
		int[][] A = new int[rows][cols];
		System.out.println("Original Matrix");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				A[i][j]=rnd.nextInt(10);
				System.out.print(A[i][j]+"\t");
			}
		System.out.println();
		}
		int [][] B = new Zeros().Xero(A);
		
		System.out.println("Zeros Matrix");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(B[i][j]+"\t");
			}
		System.out.println();
		}
	}
}
	
			