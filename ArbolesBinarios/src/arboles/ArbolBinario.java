package arboles;

public class ArbolBinario<T extends Comparable<T>> implements Tree<T>{

	private Node<T> root;
	
	@Override
	public void insert(T data) {
		// TODO Auto-generated method stub
		if(root == null) {
			root = new Node<>(data,null);
		}else {
			//hay items en el arbol
			insert(data, root);
		}
	}

	private void insert(T data, Node<T> node) {
		// TODO Auto-generated method stub
		//la data es más pequeña
		if(node.getData().compareTo(data) < 0) {
			//sigue buscadando en el subarbol izquierdo
			if(node.getLeftChild() != null)
				insert(data, node.getLeftChild());
			else
				//setear el nodo izquierdo
				node.setLeftChild(new Node<>(data,node));
		//mayor
		}else {
			if(node.getData().compareTo(data) < 0) {
				//sigue buscadando en el subarbol derecho
				if(node.getRightChild() != null)
					insert(data, node.getRightChild());
				else
					//setear el nodo izquierdo
					node.setRightChild(new Node<>(data,node));
			}
		}
	}

	@Override
	public void remove(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traversal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T getMin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getMax() {
		// TODO Auto-generated method stub
		return null;
	}

}
