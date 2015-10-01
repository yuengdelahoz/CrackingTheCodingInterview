public class Q41{
	boolean isBalanced(Node n){
		if (n == null)
			return true;
		else{
			int left = height(n.left);
			int right = height(n.right);
			boolean flag = false;
			if (Math.abs(left - right) < 2)
				flag = true;
			return flag && isBalanced(n.right) && isBalanced(n.left);
		}
	}
}
	int height(Node n){
		if (n == null) return 0;
		else{
			left = height (n.left);
			right = height(n.right);
			int max = max (left,right);
			return max + 1;
		}
	}
	
	public int height (Node n){
		if (n == null) return 0;
		else 
			int left = height (n.left);
			if (left == -1)
				return =-1;
			int right = height (n.right);
			if (rignt == -1)
				return -1;
			int diff =  left - right;
			if (Math.abs(diff) > 1)
				return -1;
			else 
				return Math.max(left,right)+1;
	}

	public boolean isBalanced(Node n){
		if (height(n)== -1)
			return false;
		else
			return true;
	}
}