public class Q45{
	private boolean isBST(Node n,int min, int max){
		if (n==null) return true;
		if (n.key>= min && n.key < max){
			return isBST(n.left,min,n.key) && isBST(n.right,n.key,max);
		}
		else
			return false;
	}

	public boolean isBST(Node n){
		return isBST(n,Integer.INT_MIN, Integer.INT_MAX);
	}
}