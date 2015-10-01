package library;
import java.util.Random;
public class List{
	Random rnd = new Random();
	private int size = rnd.nextInt(6)+4;
	private Node root ;

	public Node CreateList(){
		root=new Node("ROT0");
		Node cur=root;
		for(int i=1;i<size;i++){
			Node temp = new Node("MSG"+rnd.nextInt(20));
			cur.addNext(temp);
			cur = temp;
		}
		return root;
	}

	public Node CreateList(String msg){
		root=new Node(msg);
		Node cur=root;
		for(int i=1;i<size;i++){
			Node temp = new Node(msg);
			cur.addNext(temp);
			cur = temp;
		}
		return root;
	}


	public Node CreateList(int size){
		Node cur=null;
		int cnt = 0;
		for(int i=1;i<size;i++){
			if (i > size/2) cnt--;
			else cnt++;
			Node temp = new Node("MSG"+cnt);
			temp.next = cur;
			cur = temp;
		}
		return cur;
	}

	public int getSize(){
		return size;
	}
	
	public void printList(){
		Node cur = root;
		System.out.println();
		while(cur!=null){
			System.out.print("Node "+cur.getID()+" ("+cur.getData()+"-"+cur.op+")-->");
			cur=cur.getNext();
		}
			System.out.println("NULL");
	}

	public Node genCircularList(){
		Random rnd = new Random();
		int size = 10 + rnd.nextInt(6);
		Node H = new Node();
		Node tmp = H;
		Node ln = null;
		int li = 2 + rnd.nextInt(5);
		for (int i=1; i<size;i++){
			System.out.print("Node "+tmp.getID()+"-->");
			if (i==li){
				ln = new Node();
				tmp.next = ln;
				tmp = ln;
			}
			else {
				Node tp = new Node();
				tmp.next = tp;
				tmp = tp;
			}
		}
		tmp.next = ln;
		System.out.println("Node "+tmp.next.getID());
		return H;
	} 
}