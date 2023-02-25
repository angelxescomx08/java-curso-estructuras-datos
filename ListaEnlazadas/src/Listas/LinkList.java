package Listas;

public class LinkList <T extends Comparable<T>> implements List<T> {

	private Node<T> root;
	private int numberOfItems;
	
	@Override
	public void insert(T data) {
		// TODO Auto-generated method stub
		if(root == null) {
			root = new Node<>(data);
		}else {
			insertBeginning(data);
		}
	}

	//O(1)
	private void insertBeginning(T data) {
		// TODO Auto-generated method stub
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(root);
		root = newNode;
	}

	//O(N)
	private void insertEnd(T data, Node<T> node) {
		// TODO Auto-generated method stub
		if(node.getNextNode() != null) {
			insertEnd(data, node.getNextNode());
		}else {
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
	}
	
	@Override
	public void remove(T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void traverse() {
		// TODO Auto-generated method stub
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
