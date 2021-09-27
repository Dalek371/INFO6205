# Program Structure & Algorithms 2021 Fall

## Assignment No.2

#### Jing Dai NUID 001569042



### 1、Task

(1) To implement three methods of a class called *Timer*.

(2) Implement *Insertion Sort*.

(3) Implement a main program or own unit tests to actually run the following benchmarks: measure the running times of this sort, using four different initial array ordering situations: random, ordered, partially-ordered and reverse-ordered.Draw any conclusions from your observations regarding the order of growth.

### 2、Unit tests result

(1)

Benchmark Test

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/assignment02/BMtest.PNG)

Timer Test

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/assignment02/Timertest.PNG)

(2)

Insert Sort Test

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/assignment02/InsertTest.PNG)

### 3、Relationship Conclusion

growth of time:
#### Ordered < Partially ordered < Random < Reverse ordered

Ordered array: the best condition: N times, O(N)

Reverse ordered array: the worst condition, n*(n–1)/2 times, O(N²)

Partially ordered/Random: O(N)-O(N²)

### 4、Evidence

InsertionSort.java running test result in table:

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/assignment02/table.PNG)

in chart:

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/assignment02/chart.png)

We can see the difference form the chart clearly and get the conclusion:

Growth of time: **Ordered < Partially ordered < Random < Reverse ordered**



### 
