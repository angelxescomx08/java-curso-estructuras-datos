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
		if( root != null)
			remove(data, root);
	}

	private void remove(T data, Node<T> node) {
		
		if(node == null)return;
		
		//buscamos el item que queremos remover
		if(data.compareTo(node.getData()) < 0) {
			remove(data,node.getLeftChild());
		}else if(data.compareTo(node.getData()) > 0) {
			remove(data,node.getRightChild());
		}else {
			//Es el item que se quiere remover
			
			
			//si el nodo es una hoja
			if(node.getLeftChild() == null && node.getRightChild() == null) {
				//checar si es hijo izquierdo o derecho
				Node<T> parent = node.getParentNode();
				
				//parent != null para ver si es la raíz
				if(parent != null && parent.getLeftChild() == node) {
					parent.setLeftChild(null);
				}else if(parent != null && parent.getRightChild() == node) {
					parent.setRightChild(null);
				}
				
				//si la raiz es el nodo que se quiere remover
				if(parent == null)
					root = null;
				
				//remueve el nodo y hace que lo pueda eliminar el garbage colector
				node = null;
			}
			//remover items con un hijo
			else if(node.getLeftChild() == null && node.getRightChild() != null) {
				Node<T> parent = node.getParentNode();
				
				//parent != null para ver si es la raíz
				if(parent != null && parent.getLeftChild() == node) {
					parent.setLeftChild(node.getRightChild());
				}else if(parent != null && parent.getRightChild() == node) {
					parent.setRightChild(node.getRightChild());
				}
				
				if(parent == null) {
					root =  node.getRightChild();
				}
				
				node.getRightChild().setParentNode(parent);
				node = null;
			}
			
			//remover items con un hijo (left)
			else if(node.getLeftChild() != null && node.getRightChild() == null) {
				Node<T> parent = node.getParentNode();
				
				//parent != null para ver si es la raíz
				if(parent != null && parent.getLeftChild() == node) {
					parent.setLeftChild(node.getLeftChild());
				}else if(parent != null && parent.getRightChild() == node) {
					parent.setRightChild(node.getRightChild());
				}
				
				if(parent == null) {
					root =  node.getLeftChild();
				}
				
				node.getLeftChild().setParentNode(parent);
				node = null;
			}
			//remover uno que tiene dos hijos
			else {
				//find el predecesor
				Node<T> predecesor = getPredecessor(node.getLeftChild());
				
				//intercambiamos los valores
				T tmp = predecesor.getData();
				predecesor.setData(node.getData());
				node.setData(tmp);
				
				//llamanos a remover con el predecesor
				remove(data, predecesor);
			}
		}
	}

	private Node<T> getPredecessor(Node<T> node) {
		if (node.getRightChild() != null)
			return getPredecessor(node.getRightChild());
		
		return node;
		
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
