package DynamicArrays;

public class Main {

	public static void main(String[] args) {
		// Using our Linked list class
		
		var list = new LinkedList();
		list.addLast(20);
		list.addLast(30);
		list.addLast(20);
		list.addFirst(10);
		System.out.println(list.indexOf(10));
		System.out.println(list.indexOf(40));
		System.out.println(list.contains(10));
		System.out.println(list.contains(40));
		list.removeFirst();
		list.removeLast();
		
	}

}
