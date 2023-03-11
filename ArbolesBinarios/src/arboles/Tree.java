package arboles;

public interface Tree<T> {
	public void insert(T data);
	public void remove(T data);
	
	//in-order da el orden natural 
	public void traversal();
	public T getMin();
	public T getMax();
}
