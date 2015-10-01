import library.*;
public class Palindrome{
	int size;
	public boolean isPalindrome(Node n){
		Node r = reverse(n);
		Node.print(r);
		for (int i=0;i<size/2;i++){
				if (r!=null && n!=null){
					if (r.data.equals(n.data)){
						r=r.next;
						n=n.next;
					}
					else
						return false;
				}
		}
		return true;
	}

	private Node reverse(Node n){
		Node next=null;
		Node tmp=null;
		while (n!=null){
			tmp = Node.copy(n);
			tmp.next=next;
			next = tmp;
			n=n.next;
			size++;
		}
	return tmp;
	}

	public static void main (String[] args){
		List l = new List();
		Node r = l.CreateList(14);
		Node.print(r);
		Palindrome p = new Palindrome();
		System.out.println("The list is" + (p.isPalindrome(r)?" ":" NOT ") + "a Palindrome");
	}	
}