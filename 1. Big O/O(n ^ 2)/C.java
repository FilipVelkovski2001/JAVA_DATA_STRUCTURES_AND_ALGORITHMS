package BigO;

public class C {

	// Algorithms that run 0(n ^ 2) are slower than linear time 0(n)
	// If we are dealing with an array with the size of 50 items we won't see much of a difference
	// But as our input grows larger and larger algorithms that run in 0(n ^ 2) get slower and slower
	
	public void log(int[] numbers) {
		// 0(n ^ 2)
		for(int first : numbers) { //0(n)
			for(int second : numbers) { //0(n)
				System.out.println(first + ", "+ second);
			}
		}
	}
	
	public void logTwo(int[] numbers) {
		// 0(n ^ 2)
		for(int number : numbers) { // O(n)
			System.out.println(number);
		}
		
		for(int first : numbers) { //0(n)
			for(int second : numbers) { //0(n)
                  System.out.println(first + ", "+ second);				
				
			}
		}
	}
	
	public void logThree(int[] numbers) {
		// 0(n ^ 3)
		for(int number : numbers) { // O(n)
			System.out.println(number);
		}
		
		for(int first : numbers) { //0(n)
			for(int second : numbers) { //0(n)
				for(int third : numbers) {
                  System.out.println(first + ", "+ second + ", "+ third);
				}
				
			}
		}
	}
	
}
