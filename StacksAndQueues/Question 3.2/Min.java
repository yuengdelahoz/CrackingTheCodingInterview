package StacksAndQueues;
import library.*;
public class Min<T> extends Stack<T>{
	Stack<T> min = new Stack<T>();
	Node top = null;
	int size;
	public T getMin(){
		T tmp = (T) min.peek();
		return tmp;
	}
	
	@Override
	public int push (T ele){
		Node tmp = new Node (ele);
		tmp. next = top;
		top = tmp;
		size++;
		Integer v = (Integer) ele;
		if (min.size > 0){
			T tmp2 = min.peek();
			Integer m = (Integer) tmp2 ;
			if (v.intValue() < m.intValue())
					min.push(ele);
		}
		else 
			min.push(ele);
		return size;
	}
	
	@Override
	public T pop(){
		T tmp = (T) top.data;
		if (tmp == min.peek())
			min.pop();
		top = top.next;
		return tmp;
	}

}
