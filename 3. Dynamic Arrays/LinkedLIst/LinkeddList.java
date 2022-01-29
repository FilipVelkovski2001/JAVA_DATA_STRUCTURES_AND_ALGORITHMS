package DynamicArrays;

import java.awt.List;
import java.util.LinkedList;

public class LinkeddList {

	public static void main(String[] args) {
		LinkedList nums = new LinkedList();
		nums.addLast(10);
		nums.addLast(20);
		nums.addLast(30);
		nums.addFirst(5);
		nums.removeLast();
		nums.removeFirst();
		nums.remove(0);
		System.out.println(nums.indexOf(20));
		System.out.println(nums.contains(4));
		System.out.println(nums.size());
		System.out.println(nums);
		var array = nums.toArray();

	}

}
