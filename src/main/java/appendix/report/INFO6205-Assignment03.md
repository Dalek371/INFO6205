# Program Structure & Algorithms 2021 Fall

## Assignment No.3

#### Jing Dai NUID 001569042



### 1、Task

Step 1:
(a) Implement height-weighted Quick Union with Path Compression. For this, you will flesh out the class UF_HWQUPC. 

(b) Check that the unit tests for this class all work. You must show "green" test results in your submission (screenshot is OK). 

Step 2:
Using your implementation of UF_HWQUPC, develop a UF ("union-find") client that takes an integer value n from the command line to determine the number of "sites." Then generates random pairs of integers between 0 and n-1, calling connected() to determine if they are connected and union() if not. Loop until all sites are connected then print the number of connections generated. Package your program as a static method count() that takes n as the argument and returns the number of connections; and a main() that takes n from the command line, calls count() and prints the returned value.

Step 3:
Determine the relationship between the number of objects (*n*) and the number of pairs (*m*) generated to accomplish this. 

### 2、Unit tests result

For step1，complete the UF_HWQUPC and the unit tests are passed.

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/assignment03/Unit%20test.PNG)

For Step2，here is the result of my runs.

Please find the client in class UFClient.java in the path under the same folder of UF_HWQUPC.

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/assignment03/result.PNG)

### 3、Relationship Conclusion

The relationship between the number of objects (*n*) and the number of pairs (*m*) might be

##### **M ~ NlogN**

Precisely，it's closed to **1.2NlogN**

### 4、Evidence

We can clearly see in the result table about the number of the runs.

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/assignment03/table.PNG)

considering  from the site of 10000, we can deduce that the expression is near 10000 \* log10000 = 40000

so the relationship with be close to **M=NlogN**.

and we can guess that the coefficient might be around 1.2 .

we can see in the graph

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/assignment03/chart.PNG)

that **1.2nlogn** is very close to the real result points.

Therefore, the conclusion is:

### M=(1.2)N log N

