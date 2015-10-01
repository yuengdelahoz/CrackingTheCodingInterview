import java.util.Random;
public class Sorting{
	static int[] helper;
	public void BubbleSort(int[] A){
		int temp = 0;
		for (int i=0;i<A.length;i++)
			for(int j=i;j<A.length;j++)
				if (A[j]<A[i]){
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
	}
	

	public void SelectionSort(int[] A){
		int temp = 0;
		int min =0;
		int k = 0;
		for (int i=0;i<A.length;i++){
			min = A[i];
			for(int j=i;j<A.length;j++){
				if (A[j]< min){
					min = A[j];
					k = j;
				}
			}
			temp = A[i];
			A[i] = min;
			A[k] = temp;
		}
	}

	public void InsertionSort(int[] A){
		int s = 1;
		int cur = 0;
		for (int i=1;i<A.length;i++){
			cur = A[i];
			int k=0;
			for (int j=i-1;j>=0;j--){
				if (cur > A[j]){
						k = j+1;
						break;
				}
				else
					A[j+1]=A[j];
			}
			A[k]=cur;
		}
	}
	public void MergeSort(int[] A){
		helper = new int[A.length];
		MergeSort(A,0,A.length-1);
	}

	private void MergeSort(int[] A,int min, int max){
		if (min==max) return ;
		int middle= (max + min)/2;
		MergeSort(A,min,middle);
		MergeSort(A,middle+1,max);
		Merge(A,min,middle,max);
	}

	private void Merge(int[] A, int min,int middle,int max){
		int l = min;
		int m = middle+1;
		int c =0;
		System.out.println("\n"+l +" "+m+" "+c);
		while (l <= middle && m<=max){
			if (A[m]<A[l]){
				helper[c]=A[m];
				m++;
			}else{
				helper[c]=A[l];
				l++;
			}
				c++;
		}
		while (l <=middle)
			helper[c++]=A[l++];

		while (m <=max)
			helper[c++]=A[m++];
		
		for (int k=0,i=min;i<=max;i++,k++)
			A[i]=helper[k];
	}

	public static void main(String[] args){
		Random rnd = new Random();
		Sorting s = new Sorting();
		int[] A = new int[10];
		for (int i=0;i<A.length;i++){
			A[i]= rnd.nextInt(101);
			System.out.print(A[i]+"\t");
		}
		s.MergeSort(A);
		System.out.println();
		for (int i=0;i<A.length;i++){
			System.out.print(A[i]+"\t");
		}
		System.out.println();
	}
}