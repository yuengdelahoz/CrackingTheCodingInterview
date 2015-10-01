import library.*;
import java.util.Random;
public class DogCats{
	Queue<Animal> dog;
	Queue<Animal> cat;
	int size;	
	public DogCats (){
		dog = new Queue<Animal>();
		cat = new Queue<Animal>();
	}

	public Animal dequeueAny(){
			Animal d = dog.Peek();
			Animal c = cat.Peek();
			if (d == null && c != null) return dequeueCat();
			else if ( d!=null && c == null) return dequeueDog();
			if (d.getTime() < c.getTime())
				return dequeueDog();
			else return dequeueCat();
	}

	public Animal dequeueDog(){
				size--;
				return dog.Dequeue();
	}

	public Animal dequeueCat(){
				size--;
				return cat.Dequeue();
	}

	public void enqueue(Animal a){
		size++;
		if(a.getType()==Animal.Type.dog) dog.Enqueue(a);
		else cat.Enqueue(a);
	}

	public int size(){ return size;}

	private static class Animal{
		private static int c;
		private int t;
		public enum Type {dog,cat};
		private Type b;
		public Animal (){
			t=c++;
			Random rnd = new Random ();
			int id = rnd.nextInt(2199);
			if (id <1009) b = Type.dog;
			else b = Type.cat;
		}
		public int getTime(){ return t;}
		public Type getType(){ return b;}
	}
		
	public static void main (String[] args){
		DogCats ad = new DogCats();
		int n = 10;
		while (n > 0){
			n--;
			Animal a = new Animal();
			ad.enqueue(a);
			System.out.println(a.getType());
		}
		System.out.println(ad.size());
		Animal tmp = ad.dequeueAny();
		System.out.println(ad.size());
		tmp = ad.dequeueDog();
		System.out.println(ad.size());
		tmp = ad.dequeueCat();
		System.out.println(ad.size());
		System.out.println("--------------------------------");
		while (ad.size()!=0) System.out.println(ad.dequeueAny().getType());
	}
}
