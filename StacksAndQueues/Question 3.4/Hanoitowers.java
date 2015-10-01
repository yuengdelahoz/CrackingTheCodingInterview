import library.*;
public class Hanoitowers{
	public void move (Stack[] S, int N, int i){
		int j;
		if (i==0) j=2;
		else j=0;
		if (N==3){
			S[j].push(S[i].pop());
			S[1].push(S[i].pop());
			S[1].push(S[j].pop());
			S[j].push(S[i].pop());
			S[i].push(S[1].pop());
			S[j].push(S[1].pop());
			S[j].push(S[i].pop());
		}
		else {
			move(S,N-1,i);
			S[1].push(S[i].pop());
			move(S,N-1,j);
			S[j].push(S[1].pop());
			move(S,N-1,i);
		}
	}

	public static void main (String[] args){
		Stack<Integer> s0 = new Stack<Integer>();
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		for (int i=9;i>0;i--){
			s0.push(new Integer(i));
		}
		s0.Print();
		s1.Print();
		s2.Print();
		Stack[] S = {s0,s1,s2};
		Hanoitowers ht = new Hanoitowers();
		ht.move(S,9,0);
		System.out.println("\nResults");
		s0.Print();
		s1.Print();
		s2.Print();
	}
}