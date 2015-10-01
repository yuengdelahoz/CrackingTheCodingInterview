public class Q44{
	public LinkedList createList(Node n){
		if (n==null) return null;
		else{
			Node d = null;
			List<Node> lst = new List<Node>();
			Queue<Node> Q = new Queue<Node>();
			Q.enqueue(n);
			int c = 1;
			int k = 0;
			Node next = null;
			while(!Q.isEmpty){
				if (c!=0){
					c--;
					Node t = Q.dequeue();
					d = new Node(t);
					d.next = next;
					next = d;
					Node[] Neighbors = t.getNeibors();
					k = k + Neighbors.size;
					for (Node v: Neighbors)
						Q.enqueue(v);
				}
				if(c==0){
					c=k;
					k=0;
					next = null;
					lst.add(d);
				}
			}
		}
	}