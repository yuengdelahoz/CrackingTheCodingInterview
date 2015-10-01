package library;
import java.util.*;
public class Queue<T>{
	LinkedList<T> list;
	public Queue (){
		list = new LinkedList<T>();	
	}

	public int Enqueue(T e){
		list.addLast(e);
		return list.size();
	}

	public T Dequeue(){
		return list.removeFirst();
	}
	
	public int size(){
		return list.size();
	}
	
	public T Peek(){
		return list.peek();
	}	
}