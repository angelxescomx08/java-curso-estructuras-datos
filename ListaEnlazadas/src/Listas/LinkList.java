package Listas;

public class LinkList <T extends Comparable<T>> implements List<T> {

	private Node<T> root;
	private int numberOfItems;
	
	@Override
	public void insert(T data) {
		if(root == null) {
			root = new Node<>(data);
		}else {
			insertBeginning(data);
		}
	}

	//O(1)
	private void insertBeginning(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(root);
		root = newNode;
	}

	//O(N)
	private void insertEnd(T data, Node<T> node) {
		if(node.getNextNode() != null) {
			insertEnd(data, node.getNextNode());
		}else {
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
	}
	
	@Override
	public void remove(T data) {
		if(root == null)return;
		
		if(root.getData().compareTo(data)  == 0) {
			root = root.getNextNode();
		}else {
			remove(data,root, root.getNextNode());
		}
	}

	//O(N)
	private void remove(T data, Node<T> previous, Node<T> actualNode) {
		//encontrar el nodo que queremos
		while(actualNode != null) {
			if(actualNode.getData().compareTo(data) == 0) {
				numberOfItems--;
				previous.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			previous = actualNode;
			actualNode = actualNode.getNextNode();
		}
	}

	@Override
	public void traverse() {
		if(root == null)return;
		
		Node<T> actualNode = root;
		
		while(actualNode != null) {
			System.out.println(actualNode);
			actualNode = actualNode.getNextNode();
		}
	}

	@Override
	public int size() {
		return numberOfItems;
	}

}
