package Listas;

public class App {

	public static void main(String[] args) {
		LinkedList<Person> people = new LinkedList<>();
		
		people.insert(new Person(23,"Adam"));
		people.insert(new Person(34,"Daniel"));
		people.insert(new Person(19,"Michelle"));
		
		people.traverse();
		
		System.out.println();
		
		people.reverse();
		
		people.traverse();
		
		//System.out.println();
	}

}
