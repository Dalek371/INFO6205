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

![](C:\Users\Administrator\Desktop\courses\info6205\Assignment02\BMtest.PNG)

Timer Test

![](C:\Users\Administrator\Desktop\courses\info6205\Assignment02\Timertest.PNG)

(2)

Insert Sort Test

![](C:\Users\Administrator\Desktop\courses\info6205\Assignment02\InsertTest.PNG)

### 3、Relationship Conclusion

growth of time:
**Ordered < Random ~ Partially ordered < Reverse ordered**

Ordered array: the best condition: N times, O(N)

Reverse ordered array: the worst condition, n*(n–1)/2 times, O(N²)

Random/ Partially ordered: O(N)-O(N²) and their difference depends on the proportion of disordered parts in partially ordered array.

### 4、Evidence

InsertionSort.java running test result in table:

![](C:\Users\Administrator\Desktop\courses\info6205\Assignment02\table.PNG)

in chart:

![](C:\Users\Administrator\Desktop\courses\info6205\Assignment02\chart.png)

We can see the difference form the chart clearly and get the conclusion:

Growth of time: **Ordered < Random ~ Partially ordered < Reverse ordered**



### 
