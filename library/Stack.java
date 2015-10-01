package library;
import java.util.*;
public class Stack<T>{
	public int size;
	public int id;
	private static int accum=0;
	Node top = null;

	public Stack(){
		this.size = 0;
		id = accum++;
	}

	public void Print(){
		System.out.print("Stack " + id + ": ");
		Node.print(top);
	}
	
	public T pop(){
		if (top == null ) return null;
		T tmp = (T) top.data;
		top= top.next;
		size--;
		return tmp;	
	}	

	public T peek(){
		T tmp = (T) top.data;
		return tmp;	
	}	

	public int push(T element){
		Node temp = new Node (element);
		temp.next=top;
		top = temp;
		size++;
		return size;
	}
}