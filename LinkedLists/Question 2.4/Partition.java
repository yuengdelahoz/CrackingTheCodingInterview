import library.*;
public class Partition{
	public void Divide(Node n,int x){
		Node H1, H2, tmp1,tmp2;
		H1=null;H2=null;tmp1=null;tmp2=null;
		while(n!=null){
			String data = n.data;
			data=data.substring(3);
			int d =Integer.parseInt(data);
			if (d<x){
				if (H1==null){
					H1=n;
					tmp1=H1;
				}
				else
					tmp1.next=n;
					tmp1=n;
			}
			else{
				if (H2==null){
					H2=n;
					tmp2=H2;
				}
				else
					tmp2.next=n;
					tmp2=n;
			}
		n=n.next;
		}
		tmp1.next=H2;
		tmp2.next=null;
	}
	public static void main (String[] args){
		List lst = new List();
		Node root = lst.CreateList();
		lst.printList();
		Partition p = new Partition();
		p.Divide(root,10);
		lst.printList();
	}
}