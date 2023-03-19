package arboles;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbolBinario<Integer> ab = new ArbolBinario<>();
		ab.insert(2);
		ab.insert(55);
		ab.insert(67);
		ab.insert(12);
		ab.insert(11);
		
		ArbolBinario<Integer> ab2 = new ArbolBinario<>();
		ab2.insert(2);
		ab2.insert(5);
		ab2.insert(67);
		ab2.insert(12);
		ab2.insert(11);
		
		//System.out.println(ab.getMin());
		//System.out.println(ab.getMax());
		
		Comparador<Integer> c = new Comparador<>();
		System.out.println(c.comparar(ab.getRoot(), ab2.getRoot()));
	}

}
