import library.*;
import java.util.HashMap;
public class Duplicates {
	public rmDuplicates(Node root){
		HashMap<String, Integer> tbl = new HashMap<String, Integer>();
		Node cur = root;
		Node prev = root;
		while(cur!=null){
			int id = cur.getID();
			System.out.println("ID " + id);
			String data = cur.getData();
			Integer ID = new Integer(cur.getID());
			if (id==0){
				prev = cur;
				tbl.put(data,ID);
			}
			else{
				boolean rslt = tbl.containsKey(data);
				tbl.put(data,ID);
				if (rslt){
					prev.addNext(cur.getNext());
					prev = prev;
				}
				else prev = cur;
			}
			if (cur.getNext()==null) break;
			cur = cur.getNext();
		}
	}
	public static void main (String[] args){
		List lst = new List();
		Duplicates dp = new Duplicates();
		Node root = lst.CreateList();
		lst.printList();
		dp.rmDuplicates(root);
		System.out.println();
		lst.printList();
	}
}