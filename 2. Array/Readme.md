# Arrays in Java

An array in Java is a group of like-typed variables referred to by a common name. Arrays in Java work differently than they do in C/C++. Following are some important points about Java arrays. 

In Java, all arrays are dynamically allocated. (discussed below)
Since arrays are objects in Java, we can find their length using the object property length. This is different from C/C++, where we find length using sizeof.
A Java array variable can also be declared like other variables with [] after the data type.
The variables in the array are ordered, and each has an index beginning from 0.
Java array can be also be used as a static field, a local variable, or a method parameter.
The size of an array must be specified by int or short value and not long.
The direct superclass of an array type is Object.
Every array type implements the interfaces Cloneable and java.io.Serializable.
An array can contain primitives (int, char, etc.) and object (or non-primitive) references of a class depending on the definition of the array. In the case of primitive data types, the actual values are stored in contiguous memory locations. In the case of class objects, the actual objects are stored in a heap segment. 

![](https://media.geeksforgeeks.org/wp-content/uploads/Arrays1.png)

## Dynamic Array Java

A simple dynamic array can be constructed by allocating an array of fixed size, typically larger than the number of elements immediately required. The elements of the dynamic array are stored at the start of the underlying array, and the remaining positions towards the end of the array are reserved or unused. Elements can be added at the end of the dynamic array by using reserved space until the space is completely consumed. The underlying fixed-size array needs to be increased in size when further elements have to be added after all the space is consumed. Typically resizing is expensive as it involves allocating a new array and copying each element from the original array (costs O(n) time).

A fixed-size array will suffice in scenarios where the maximum logical size is fixed. A dynamic array will be needed when the maximum logical size is unknown initially, or likely to change.

Features of Dynamic Array
Key features of a dynamic array are adding, deleting, and resizing an element. Let us now check these features.

1. Add an element to a dynamic array
As discussed in the previous section, elements are added at the end of an array. A new array (typically double the original array size) is created and data is copied from the original array to the new one after the allocated space is consumed.

![](https://examples.javacodegeeks.com/wp-content/uploads/2019/10/AddElement-wm.png.webp)



2. Delete an element from a dynamic array
The remove(i) removes the element at index location – ‘i’ and shifts all the elements at the right side of the index to left.

![](https://examples.javacodegeeks.com/wp-content/uploads/2019/10/RemoveElement-wm.png.webp)

Dynamic Array Java - Removing element


3. Resize an array
An array’s size can be increased or decreased. Resizing is usually an expensive operation, as it would mean creating a new array and copying all the elements (costs O(n) time).



4. Table for complexity O(n)
A dynamic array automatically grows when you try to make insertion and there is no more space left for the new item. Usually, the array doubles in size. In this case, a new array has to be created with double the size of the previous one and copy all the elements to the new one. This will take O(n), but a simple insertion on an empty cell costs only O(1). This is also true when we are trying to remove an element.

Also if we want to search the array, giving the index takes only O(1). If we search by the value we have to parse all the array so the worst-case scenario is O(n).

Operations	average	worst
access	O(1)	O(1)
search	O(n)	O(n)
insertion	O(1)	O(n)
deletion	O(1)	O(n)



