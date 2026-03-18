## 5.2.3 Question :

1. in the base case of the divide and Conquer algorithm for calculating factorial, explain the diffrences in the code structure between if and alse conditions! 

2.	Is it possible to modify the loop in the factorialBF() method to use an alternative to the for loop? Please explain and give example if needed!

3.	Please explain the differences between facto = facto*i; and int facto = n * factorialDC(n-1); !

4.	Make a conclusion about the differences in how each method works. factorialBF()  and factorialDC()!


### Answer :
1. In the divide and conquer algorithm for calculating factorial, the if condition represents the base case, which is used to stop the recursion. When the value of n reaches 1, the function immediately returns 1 without making any further recursive calls. On the other hand, the else condition represents the recursive case, where the function continues the process by calling itself with a smaller value (n-1).

2. Yes, it is possible to modify the loop in the factorialBF() method by using another type of loop, such as a while loop. A while loop can perform the same task as a for loop by repeatedly executing a block of code as long as a given condition is true. For example, the factorial calculation can be implemented using a while loop by initializing a counter variable and incrementing it until it reaches the desired number, while multiplying the result in each iteration.

3. facto = facto * i; uses a loop (iterative) to calculate step by step, while int facto = n * factorialDC(n-1); uses recursion by calling the function repeatedly.

4. factorialBF() uses a loop (faster and simple), while factorialDC() uses recursion (more elegant but uses more memory).

## Question 5.3.3 :
1.	Explain the differences between the two methods created powerBF() dan powerDC()!

2.	Does the combine stage exist in the provided code? Show the relevant part!

3.	In the powerBF() method, parameters are used to pass the base number and its exponent, even though the Power class already contains attributes for these values (baseNumber and exponent atribute). Do you think it is still relevant for the method to have parameters? Could the method be implemented without parameters instead? If so, how would the powerBF() method be structured without parameters?

4.	Summarize how the powerBF() and powerDC() methods work!

### Answer :
1. The powerBF() method uses an iterative approach with a loop, while powerDC() uses a recursive divide and conquer approach by breaking the problem into smaller parts.

2. Yes, the combine stage exists in the code, which is when the results of the recursive calls are multiplied together to produce the final result.

3. It is not strictly necessary for the method to have parameters because the class already has attributes for the base number and exponent. The method can be implemented without parameters by directly using baseNumber and exponent inside the method.

4. In summary, powerBF() works by calculating the result step by step using a loop, while powerDC() works by recursively splitting the problem and then combining the results, making it more efficient.

## 5.4.3 Queestion : 
1.	Why is mid variable needed in totalDC()method?

2.	Explain the following statements in totalDC()method?
 double lsum = totalDC(arr, l, mid);
 double rsum = toralSX(arr, mid+1, r);
 
3.	Why is it necessary to sum the results of lsum and rsum as shown below??
 return lsum+rsum

4.	What is the base case of totalDC()method?

5.	Draw a conclusion about how totalDC() works

### Answer : 
1. The mid variable is needed to divide the array into two parts (left and right) so the divide and conquer method can process smaller subproblems.

2. The statement double lsum = totalDC(arr, l, mid); calculates the sum of the left part of the array, while double rsum = totalDC(arr, mid+1, r); calculates the sum of the right part.

3. It is necessary to sum lsum and rsum because both represent partial results, and combining them gives the total sum of the array.

4. The base case of totalDC() is when l == r, which means there is only one element, so the method returns that element.

5. In conclusion, totalDC() works by dividing the array into smaller parts, calculating each part recursively, and then combining the results to get the total sum.