public class Q47{
	boolean static flag = false;
	public Node commonAncestor(Node n1, Node n2){
		if (n1 == null || n2 == null) return null;
		if (n1 == n2) return n1;
		if (!flag){
			flag = true; 
			balanceheight(n1,n2);
		}
		n1 = n1.parent;
		n2 = n2.parent;
		commonAncestor(n1,n2);
	}
	private void balanceHeight(n1,n2){
		int h1 = height(n1);
		int h2 = height(n2);
		if (h1 != h2)
			if (h1 > h2){
				c = h1 - h2;
				while (c != 0){
					n1 = n1.parent;
					c--;
				}
			}
		else {
			c = h2 - h1;
			while (c != 0){
				n2 = n2.parent;
				c--;
			}
		}
	}
}