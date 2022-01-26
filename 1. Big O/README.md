What is Big O notation?

Big O notation is a mathematical notation that describes the limiting behavior of a function when the argument tends towards a particular value or infinity. Big O is a member of a family of notations invented by Paul Bachmann,[1] Edmund Landau,[2] and others, collectively called Bachmann–Landau notation or asymptotic notation.

In computer science, big O notation is used to classify algorithms according to how their run time or space requirements grow as the input size grows.[3] In analytic number theory, big O notation is often used to express a bound on the difference between an arithmetical function and a better understood approximation; a famous example of such a difference is the remainder term in the prime number theorem. Big O notation is also used in many other fields to provide similar estimates.

Big O notation characterizes functions according to their growth rates: different functions with the same growth rate may be represented using the same O notation. The letter O is used because the growth rate of a function is also referred to as the order of the function. A description of a function in terms of big O notation usually only provides an upper bound on the growth rate of the function.

Associated with big O notation are several related notations, using the symbols o, Ω, ω, and Θ, to describe other kinds of bounds on asymptotic growth rates.

![](https://media.geeksforgeeks.org/wp-content/cdn-uploads/mypic.png)

Big-O Analysis of Algorithms

We can express algorithmic complexity using the big-O notation. For a problem of size N:

A constant-time function/method is “order 1” : O(1)
A linear-time function/method is “order N” : O(N)
A quadratic-time function/method is “order N squared” : O(N 2 )
Definition: Let g and f be functions from the set of natural numbers to itself. The function f is said to be O(g) (read big-oh of g), if there is a constant c > 0 and a natural number n0 such that f (n) ≤ cg(n) for all n >= n0 .

Note: O(g) is a set!

Abuse of notation: f = O(g) does not mean f ∈ O(g).

The Big-O Asymptotic Notation gives us the Upper Bound Idea, mathematically described below: 

f(n) = O(g(n)) if there exists a positive integer n0 and a positive constant c, such that f(n)≤c.g(n) ∀ n≥n0 

The general step wise procedure for Big-O runtime analysis is as follows:  

Figure out what the input is and what n represents.
Express the maximum number of operations, the algorithm performs in terms of n.
Eliminate all excluding the highest order terms.
Remove all the constant factors.
Some of the useful properties of Big-O notation analysis are as follow: 

▪ Constant Multiplication: 
If f(n) = c.g(n), then O(f(n)) = O(g(n)) ; where c is a nonzero constant. 
▪ Polynomial Function: 
If f(n) = a0 + a1.n + a2.n2 + —- + am.nm, then O(f(n)) = O(nm). 
▪ Summation Function: 
If f(n) = f1(n) + f2(n) + —- + fm(n) and fi(n)≤fi+1(n) ∀ i=1, 2, —-, m, 
then O(f(n)) = O(max(f1(n), f2(n), —-, fm(n))). 
▪ Logarithmic Function: 
If f(n) = logan and g(n)=logbn, then O(f(n))=O(g(n)) 
; all log functions grow in the same manner in terms of Big-O.

 Basically, this asymptotic notation is used to measure and compare the worst-case scenarios of algorithms theoretically. For any algorithm, the Big-O analysis should be straightforward as long as we correctly identify the operations that are dependent on n, the input size. 

Runtime Analysis of Algorithms

In general cases, we mainly used to measure and compare the worst-case theoretical running time complexities of algorithms for the performance analysis. 
The fastest possible running time for any algorithm is O(1), commonly referred to as Constant Running Time. In this case, the algorithm always takes the same amount of time to execute, regardless of the input size. This is the ideal runtime for an algorithm, but it’s rarely achievable. 
In actual cases, the performance (Runtime) of an algorithm depends on n, that is the size of the input or the number of operations is required for each input item. 
The algorithms can be classified as follows from the best-to-worst performance (Running Time Complexity): 

▪ A logarithmic algorithm – O(logn) 
Runtime grows logarithmically in proportion to n. 
▪ A linear algorithm – O(n) 
Runtime grows directly in proportion to n. 
▪ A superlinear algorithm – O(nlogn) 
Runtime grows in proportion to n. 
▪ A polynomial algorithm – O(nc) 
Runtime grows quicker than previous all based on n. 
▪ A exponential algorithm – O(cn) 
Runtime grows even faster than polynomial algorithm based on n. 
▪ A factorial algorithm – O(n!) 
Runtime grows the fastest and becomes quickly unusable for even 
small values of n.  

Where, n is the input size and c is a positive constant. 