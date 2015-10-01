import library.*;
import java.util.Random;
public class SortStack<T>{
	Stack<T> s;
	public SortStack(){
		s = new Stack<T>();
	}
	
	public void Sort(Stack<T> o){
		Integer min = new Integer(-1);
		int n = o.size-1;
		int cnt = o.size;
		while (n > 0){
			int nu = cnt;
			while (nu > 0){
				nu--;
				int minval = min.intValue();
				T tmp = o.pop();
				int tmpval = ((Integer)tmp).intValue();
				if (minval > tmpval || minval ==-1){
					min =(Integer) tmp;
				}
				s.push(tmp);
			}
			nu = cnt;
			o.push((T)min);
			while (nu > 0){
				nu--;
				T tmp = s.pop();
				if (tmp == min) continue;
				o.push(tmp);
			}
		n--;
		cnt--;
		min = new Integer(-1);
		}
}

	public static void main (String[] args){
		SortStack<Integer> ss = new SortStack<Integer>();
		Stack<Integer> s = new Stack<Integer> ();
		Random rnd = new Random();
		int n = 8;
		while (n > 0){
			s.push(new Integer(rnd.nextInt(100)));	
			n--;
		}
		s.Print();
		ss.Sort(s);
		System.out.println();
		s.Print();
	}
}