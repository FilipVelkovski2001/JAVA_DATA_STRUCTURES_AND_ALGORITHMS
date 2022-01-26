package Arrays;

import java.util.ArrayList;

public class DynamicArrays {
	public static void main(String[] args) {
		// ArrayList<Integer>  int type wrapper
		// applies to every primitive type
		// we can also use the collections with a non primitive type
		//like Student class if we have made it
		ArrayList<Integer> nums = new ArrayList<>();
		//Methods we can use
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.remove(3);
		nums.indexOf(30);
		nums.contains(3);
		nums.size();
		nums.toArray();
		System.out.println(nums);
		
	}
	  

}
