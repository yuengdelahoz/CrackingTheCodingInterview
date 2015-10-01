import static java.lang.System.out;
import library.*;
import java.util.Random;
public class SetofStacks<T>{
	Stack<Stack> S = null;
	Stack<T> cur = null;
	int k =0;
	int Th = 0;
	public SetofStacks(int Th){
		S = new Stack<Stack>();
		this.Th = Th;
	}	
	
	public int push (T ele){
		if (S.size < 1){
			cur = new Stack<T>();
			S.push(cur);
		}
		if (cur.size < Th)
			cur.push(ele);
		else {
			out.println("Threshold reached");
			cur = new Stack<T>();
			cur.push(ele);
			S.push(cur);
		}
		out.println("Current element being pushed: "+ele);
		return S.size;
	}
	
	public T pop(){
		T tmp = null;
		if (cur.size > 0){
			tmp = (T) cur.pop();
		}
		else {
			if (S.size >0){
				if(k==0){ S.pop();k=1;}
				cur = (Stack) S.pop();
			}
			tmp = (T) cur.pop();
		}	
		out.println("Current element being popped: "+tmp);
		return tmp;
		}

	public static void main (String[] args){
		SetofStacks<Integer> S = new SetofStacks<Integer>(5);
		int val = 6;
		Random rnd = new Random();
		while (val > 0){
			int tmp = rnd.nextInt(100); 
			Integer tp = new Integer(tmp);
			S.push(tp);
			val--;
		}
		out.println("----------------");
		while(val < 22 ){
			S.pop();
			val++;
		}
	}
}