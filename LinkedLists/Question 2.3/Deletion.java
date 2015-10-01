import library.*;
import java.util.Random;
public class Deletion{
	public void Delete(Node n){
		if (n!=null || n.next!=null){
			Node next = n.next;
			n.data = next.data;
			n.next = next.next;
		}
}
	public static void main (String[] args){
		List lst = new List();
		Node n = lst.CreateList();
		lst.printList();
		int size = lst.getSize();
		Random rnd = new Random ();
		int nid = rnd.nextInt(size);
		while (n.getID()!=nid){
				n=n.next;
		}
		Deletion d = new Deletion();
		System.out.println("Node to be deleted: "+n.id);
		d.Delete(n);
		lst.printList();
	}
}