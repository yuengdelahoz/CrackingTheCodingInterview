public class Q43{
	Node createTree(int[] A,int s, int e){
		if (e<s){
			return null;
		}
		else {
			int hv = (e - s + 1)/2;
			Node h = new Node(A[hv]);
			h.left = createTree(A,s,hv-1);
			h.right = createTree(A,hv+1,e);
			return h;
		}	
	}
}