package library;
import java.util.*;
public class Node<T>{
	public Node next;
	public Node prev;
	public T data;
	public int id;
	public int op;
	public static int accum =0;
	Random rnd = new Random();

	public Node (){
		this.data = null;
		this.next = null;
		this.prev = null;
		this.id = accum++;
		this.op = rnd.nextInt(10);
	}

	public Node (Node next, Node prev, T data){
		this.data = data;
		this.next = next;
		this.prev = prev;
		id =accum++;
		this.op = rnd.nextInt(10);
	}

	public Node (T data){
		this.data = data;
		this.next = null;
		this.prev = null;
		this.op = rnd.nextInt(10);
		id =accum++;
	}

	public void addNext(Node next){
		this.next = next;
	}
	public void addPrev(Node prev){
	this.prev = prev;
	}
	public Node getNext(){
		return next;
	}
	public Node getPrev(){
		return prev;
	}
	public int getID(){
		return id;
	}
	public T getData(){
		return data;
	}
	
	public static void print(Node cur){ 
		while(cur!=null){
			System.out.print("DATA: "+cur.getData()+")-->");
			cur=cur.getNext();
		}
			System.out.println("NULL");
	}

	public static void printOP(Node cur){ 
		System.out.println();
		while(cur!=null){
			System.out.print("("+cur.op+")-->");
			cur=cur.getNext();
		}
			System.out.println("NULL");
	}

	public static void printOP(Node cur,Node loop){ 
		System.out.println();
		int k =0;
		while(cur!=null){
			System.out.print("Node ("+cur.id+")-->");
			if (cur==loop) k++;
				if (k>=2) break;	
			cur=cur.getNext();
		}
			System.out.println("NULL");
	}

	public static Node copy (Node n){
		Node n1 = new Node ();
		n1.id = n.id;
		n1.op = n.op;
		n1.data = n.data;
		n1.prev = n.prev;
		n1.next = n.next;	
		return n1;
	}
}	