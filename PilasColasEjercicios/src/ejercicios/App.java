package ejercicios;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		
		MaximoPila mp = new MaximoPila();
		Stack<Integer> pila = new Stack<>();
		
		pila.push(1);
		pila.push(3);
		pila.push(5000);
		pila.push(7);
		pila.push(1);
		
		int maximo = mp.getMaximo(pila);
		
		System.out.println(maximo);
		System.out.println(pila);
	}

}
