import library.*;
public class LinkedSumation{
	public Node AddNodes(Node n1, Node n2){
		int x;
		int y;
		int c=0;
		int v;
		Node cur=null;
		Node Head=null;
		while (n1!=null || n2!=null){
			if (n1==null){
				x=0;
				y=n2.op;
				n2=n2.next;
			}
			else if (n2==null){
				x=n1.op;
				y=0;
				n1=n1.next;
			}
			else{
				x=n1.op;
				y=n2.op;
				n2=n2.next;
				n1=n1.next;
			}
			v = x+y+c;
			if (v>=10){
				v=v-10;
				c=1;
			}
			else c =0;
			// Create Node
			if (cur==null){
				Head = new Node();
				Head.op = v;
				cur=Head;
			}
			else {
				Node tmp = new Node();
				tmp.op = v;
				cur.next=tmp;
				cur=tmp;
			}
		}
		if (n1==null && n2==null){
			if (c==1){
				Node tmp = new Node();
				tmp.op = c;
				cur.next=tmp;
				cur=tmp;
			}
		}
		return Head;
	}

	public static void main (String[] args){
		List l1 = new List();
		List l2 = new List();
		Node r1 = l1.CreateList();
		Node r2 = l2.CreateList();
		Node.printOP(r1);
		Node.printOP(r1);
		LinkedSumation ls = new LinkedSumation();
		Node sum = ls.AddNodes(r1,r1);
		Node.printOP(sum);
	}
}
