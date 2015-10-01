import java.util.Random;
public class Heap{
	int[] H;
	int temp =0;
	boolean flag = false;
	int last = 0;

	public Heap(int[] A){
		H = new int[A.length+1];
		for (int i=1;i<H.length;i++)
			H[i] = A[i-1];
		last = A.length;
	}
	
	public int[] BuildMinHeap(){
		for(int i=H.length-1;i>0;i--){
			int t = i;
			while (H[i] < H[t/2] && t!=0){
				t=t/2;
			}
			temp = H[t];
			H[t] = H[i];
			BubbleDown(t,temp);
		}
		return H;
	}
	public void BuildMinHeap(int d){
		for(int i=H.length-1;i>0;i--){
			BubbleUp(i);
		}
	}
	
	public int[] getHeap(){
		return H;
	}

	private void BubbleDown(int t, int temp){
		flag = false;
		while (2*t+1 < H.length ){
			flag = true;
			if (temp > H[2*t+1]) t=2*t+1; else break;
		}
		while (2*t < H.length && flag)
			if (temp > H[2*t]) t=2*t; else break;
		H[t]=temp;
	}
	
	private int getMin(){
		int min = H[1];
		H[1] = H[last];
		H[last] = Integer.MAX_VALUE;
		BubbleDown(1,H[1]);
		last--;
		return min;
	}

	private void BubbleUp(int i){
		int t = i;
		if (H[i] > H[t/2] ) return;
		while (H[i] < H[t/2] && t!=0){
			t=t/2;
		}
		temp = H[t];
		H[t] = H[i];
		H[i] = temp;
		BubbleUp(i);
	}

	public static void main (String[] args){
		Random rnd = new Random();
		int[] A = new int[5];
		for (int i=0;i<A.length;i++){
			A[i]= rnd.nextInt(10);
			System.out.print(A[i]+"\t");
		}
		Heap h = new Heap(A);
		h.BuildMinHeap(3);
		A = h.getHeap();
		System.out.println();
		for (int i=1;i<A.length;i++){
			System.out.print(A[i]+"\t");
		}
		System.out.println();
		h.getMin();
		System.out.println();
		for (int i=1;i<A.length;i++){
			System.out.print(A[i]+"\t");
		}
		System.out.println();
	}
}