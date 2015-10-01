import library.*;
import java.util.Random;
public class Circular{
	public Node findNode(Node n){
		Node fr = n;
		Node sr = n;
		Node col = null;
		boolean flag = true;
		while(flag){
			sr = sr.next;
			for(int i=0;i<2;i++)
				fr = fr.next;
			if (fr==sr){
				sr = n;
				while (fr!=sr){
					sr = sr.next;
					fr = fr.next;
				}
				col = sr;
				flag = false;
				return sr;
			}
		}
		return col;
	}

	public static void main (String[] args){
		List lsc = new List();
		Node root = lsc.genCircularList();
		Circular fc = new Circular();
		Node loop = fc.findNode(root);
		System.out.println("Existing Loop\nLoop node: "+loop.id);
		Node.printOP(root,loop);
	}
}