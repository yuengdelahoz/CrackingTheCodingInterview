public class Q46{
	public Node findNext(Node n){
		if (n==null) return null;
		if (n.right !=null){
			Node t = n.right;
			while(t !=null)
				t=t.left;
			return t;
		}
		else {
			if (n.key <= n.parent.key)
				return n.parent;
			else{
				Node p = n.parent;
				int key = n.key;
				while (p !=null)
					if(p.key > key)
						return p;
					else
						p = p.parent;
			}
			return null;
		}
	}
}