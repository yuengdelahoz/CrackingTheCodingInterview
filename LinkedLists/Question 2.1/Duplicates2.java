import library.*;
import java.util.HashMap;
public class Duplicates2 {
	public void rmDuplicates(Node root){
		Node cur = root;
		while (cur!=null){
			Node next = cur.getNext();
			Node prev=cur;
			while (next!=null){
				if (cur.getData().equals(next.getData()))
					prev.addNext(next.getNext());
				else
					prev=next;
				next=next.getNext();
			}
			cur=cur.getNext();	
		}
	}
	public static void main (String[] args){
		List lst = new List();
		Duplicates2 dp = new Duplicates2();
		Node root = lst.CreateList();
		lst.printList();
		dp.rmDuplicates(root);
		System.out.println();
		lst.printList();
	}
}