package paquete;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> dll = new LinkedList<>();
		
		dll.addFirst("Sandra");
		dll.addLast("Marina");
		dll.addLast("Michelle");
		
		dll.removeFirst();
		dll.removeLast();
		
		for(String name: dll)
			System.out.println(name);
		
		//DoublyLinkedList<String> names = new DoublyLinkedList<>();
		
		//names.insert("Adam");
		//names.insert("Kevin");
		//names.insert("Ana");
		//names.insert("Daniel");
		
		//names.traverseBackward();
	}

}
