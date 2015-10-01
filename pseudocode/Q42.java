public class Q42{
	boolean hasRoute(Node n, Node end){
		if (n==null || end==null) return false;
		else{
			if (n == end)
				return true;
			else{
				Node neighbor[] = n.neighbors();
				for (int i=0;i<neighbor.size;i++){
					Node t = neighbor[i];
					if (!t.isVisited()){
						t.visit(true);
						hasroute(t,end);
					}
				}
			}
		}
		return false;
	}
	boolean isThere(Node start, Node end){
		return hasRoute(start,end) && hasRoute(end,start);
	}
}

