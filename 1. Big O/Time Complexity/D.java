package BigO;

public class D {

	public void greet(String[] names) {
		// O(1) Space complexity	
		for(int i = 0; i < names.length; i++) {
			System.out.println("Hi "+ names[i]);
		}
	}
	
	public void greetTwo(String[] names) {
		// O(n)	Space complexity
		String[] copy = new String[names.length];	
		for(int i = 0; i < names.length; i++) {
			System.out.println("Hi "+ names[i]);
		}
	}
	
}
