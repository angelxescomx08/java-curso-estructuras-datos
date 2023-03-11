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
		if(node.getData().compareTo(data) > 0) {
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
		//in-order O(N)
		if(root == null)return;
		
		traversal(root);
		
	}

	//O(N)
	private void traversal(Node<T> node) {
		if(node.getLeftChild() != null)
			traversal(node.getLeftChild());
		
		System.out.print(node + " - ");
		
		if(node.getRightChild() != null)
			traversal(node.getRightChild());
	}

	@Override
	public T getMin() {
		if(root == null)
			return null;
		return getMin(root);
	}

	private T getMin(Node<T> node) {
		if(node.getLeftChild() != null)
			return getMin(node.getLeftChild());
		
		return node.getData();
	}

	@Override
	public T getMax() {
		
		if(root == null)
			return null;
		return getMax(root);
	}

	private T getMax(Node<T> node) {
		
		if(node.getRightChild() != null)
			return getMax(node.getRightChild());
		
		return node.getData();
	}

}
