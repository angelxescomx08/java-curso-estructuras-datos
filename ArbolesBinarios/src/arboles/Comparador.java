package arboles;

public class Comparador<T extends Comparable<T>> {
	public boolean comparar(Node<T> nodo1, Node<T> nodo2) {
		if(nodo1 == null || nodo2 == null)return nodo1 == nodo2;
		
		if(nodo1.getData().compareTo(nodo2.getData())!=0)return false;
		
		return comparar(nodo1.getLeftChild(), nodo2.getLeftChild())&&comparar(nodo1.getRightChild(), nodo2.getRightChild());
	}
}
