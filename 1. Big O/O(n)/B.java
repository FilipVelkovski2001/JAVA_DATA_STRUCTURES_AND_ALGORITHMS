package BigO;

public class B {

	// Linear time
	
	public void log(int[] numbers, String[] names) {
		// O(n)
		for(int number : numbers) { // O(n)
			System.out.println(number);
		}
		
		for(String name : names) { // O(m)
			System.out.println(name);
		}
	}
}
