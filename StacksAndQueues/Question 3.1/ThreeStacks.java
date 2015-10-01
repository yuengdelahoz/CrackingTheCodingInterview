public class ThreeStacks<T>{
	int[] bottoms = new int[]{-1,-1,-1};
	int[] tops = new int[]{-1,-1,-1};
	int size;
	T[] A;
	public ThreeStacks(T[] array){
		size = array.length;
		tops ={0,size/3,2*size/3};
		bottom = {(size/3)-1,(2*size/3)-1,size-1};
	}

	public T pop(int sid){
			if (tops[sid] < -1) return null;	
			else {
				T value = A[tops[sid]];
				if (tops[sid] == bottoms[sid]) tops[sid] =-1;
				else
					tops[sid]=(tops[sid]-1) % array;	
				return value;
			}
	}	

	private boolean hasSpace(int sid){
		sid = sid % 3;
		if ((tops[sid]+1) % size != bottom[(sid+1) % 3])
			return true;
		else 
			return false;
	}

	private void addElement(T ele, int sid){
		sid = sid % 3;
		A[(tops[sid]+1) % size] = ele;
		top[sid] = (tops[sid]+1) % size;
	}

	private void addElementN(T ele, int sid){
		sid = sid % 3;
		int tmp = tops[sid + 1];
		while (tmp != bottoms[sid + 1]){
			
	}

	public int push(T ele, int sid){
		if (tops[sid] == -1 ){
			A[bottoms[sid]] = ele;
			tops[sid]=(tops[sid]+1) % array;	
		}
		else{
			if (hasSpace(sid))
				addElement(ele, sid);	
			else if (hasSpace(sid +1)){
				
				addElement(ele, sid + 1);
			else if (hasSpace(sid - 1))
				addElement(ele,sid -1); 
	}	