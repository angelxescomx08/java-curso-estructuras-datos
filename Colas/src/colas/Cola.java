package colas;

public class Cola<T extends Comparable<T>> {
	
	private Node<T> firstNode;
	private Node<T> lastNode;
	private int count;
	
	public boolean isEmpty() {
		return firstNode == null;
	}
	
	public int size() {
		return count;
	}
	
	//O(1)
	public void enqueue(T data) {
		this.count++;
		
		Node<T> oldLastNode = this.lastNode;
		this.lastNode = new Node<>(data);
		this.lastNode.setNextNode(null);
		
		if(isEmpty()) {
			this.firstNode = this.lastNode;
		}else {
			oldLastNode.setNextNode(lastNode);
		}
	}
	
	public T dequeue() {
		this.count--;
		T dataToDequeue = this.firstNode.getData();
		this.firstNode = this.firstNode.getNextNode();
		
		if(isEmpty()) {
			this.lastNode = null;
		}
		
		return dataToDequeue;
	}
	
}
