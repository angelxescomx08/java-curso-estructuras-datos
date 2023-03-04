package ejercicios;

import java.util.Stack;

public class MaximoPila {
	
	public int getMaximo(Stack<Integer> pila) {
		Stack<Integer> pilaAux = new Stack<>();
		int mayor = -1;
		
		//O(N)
		while(!pila.isEmpty()) {
			int valor = pila.pop();
			if(valor > mayor) {
				mayor = valor;
			}
			pilaAux.push(valor);
		}
		
		//O(N)
		while(!pilaAux.isEmpty()) {
			int valor = pilaAux.pop();
			pila.push(valor);
		}
		
		
		return mayor;
	}
	
}
