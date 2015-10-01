import library.*;
public class Kelement{
	public Node findK(int k, Node nk){
		Node n=nk; int cnt=0;
		while (n!=null){
			cnt++;
			n=n.getNext();
		}
		cnt=cnt-k; n=nk;
		while(cnt>0){
			n=n.getNext();
			cnt--;
		}
		return n;
}
	public Node findKth(int k, Node nk){
		Node runner=nk;
		for (int i=0;i<k;i++){
			runner=runner.getNext();
		}
		while (runner!=null){
			nk=nk.getNext();
			runner=runner.getNext();
		}
		return nk;
	}
	public static void main (String[] args){
		List lst = new List();
		Kelement kl = new Kelement();
		Node root = lst.CreateList();
		lst.printList();
		Node k=kl.findK(2,root);
		Node kth= kl.findKth(3,root);
		System.out.println("Node 2 to last found: " + k.getID());
		System.out.println("Node 3 to last found: " + kth.getID());
	}
}
		