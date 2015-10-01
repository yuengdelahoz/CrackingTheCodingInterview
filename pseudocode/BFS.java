public class BFS{
	// Preorder
	void BFS(Node n){
		Queue q = new Queue();
		q.enqueue(n)
		while(!q.isEmpty()){
			Node t = q.dequeue();
			if (t != null){
				visit(t);
				if (t.left != null)
					q.enqueue(t.left);
				if (t.right != null)
					q.enqueue(t.right);
			}
		}

	// Inorder
	void BFS(Node n){
		Queue q = new Queue();
	}
}
