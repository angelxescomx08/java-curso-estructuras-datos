package Listas;

public class App {

	public static void main(String[] args) {
		LinkList<Person> people = new LinkList<>();
		
		people.insert(new Person(23,"Adam"));
		people.insert(new Person(34,"Daniel"));
		people.insert(new Person(19,"Michelle"));
		
		people.traverse();
		people.remove(new Person(23,"Adam"));
		
		people.traverse();
	}

}
