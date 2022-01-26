package Arrays;


public class ArrayBuilderTest {
	public static void main(String[] args) {
		Array numbers = new Array(4);
		numbers.insert(12);
		numbers.insert(30);
		numbers.insert(31);
        System.out.println(numbers.indexOf(30));
		numbers.print();
		
		
		
	}
}
