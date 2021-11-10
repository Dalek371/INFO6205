# Program Structure & Algorithms 2021 Fall

## Assignment No.5

#### Jing Dai NUID 001569042



### 1、Task

Your task is to implement a parallel sorting algorithm such that each partition of the array is sorted in parallel. You will consider two different schemes for deciding whether to sort in parallel.
A cutoff (defaults to, say, 1000) which you will update according to the first argument in the command line when running. It's your job to experiment and come up with a good value for this cutoff. If there are fewer elements to sort than the cutoff, then you should use the system sort instead.
Recursion depth or the number of available threads. Using this determination, you might decide on an ideal number (t) of separate threads (stick to powers of 2) and arrange for that number of partitions to be parallelized (by preventing recursion after the depth of lg t is reached).
An appropriate combination of these.
There is a Main class and the ParSort class in the sort.par package of the INFO6205 repository. The Main class can be used as is but the ParSort class needs to be implemented where you see "TODO..." [it turns out that these TODOs are already implemented].
Unless you have a good reason not to, you should just go along with the Java8-style future implementations provided for you in the class repository.
You must prepare a report that shows the results of your experiments and draws a conclusion (or more) about the efficacy of this method of parallelizing sort. Your experiments should involve sorting arrays of sufficient size for the parallel sort to make a difference. You should run with many different array sizes (they must be sufficiently large to make parallel sorting worthwhile, obviously) and different cutoff schemes.

### 2、Output and Result

For the output result in console like this：

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/Assignment05/console.PNG)



To see every test in the same time, put all of them in one table:

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/Assignment05/table1.PNG)

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/Assignment05/table2.PNG)

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/Assignment05/table3.PNG)

and in the chat:

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/Assignment05/chart.png)

we can see in the chat, for every threads number there is **a range of cutoff** which has a better stable performance than the rest part. 

for 4 threads its around 25%-50%

for 8 threads its around 12.5%-50%

for 16 threads its around 7%-50%

for 32 threads its around 4%-50%（forgot to screenshot the final one with 32 threads on）

So, the result we can observe for the char that the best cutoff will be around 

***1/threads number% - 50%***

To be precisely, if there must be a common result of cut-off number that always work, it will be **25%**.

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/Assignment05/arrow.jpg)

In other words, we can consider the cut-off value from **Array size / the number threads** to **Array size/2**, and **25%** will be commonly good.

For the better threads number, it depends on the Array size and the CPU.

While sorting a huge number of elements, more threads (like 8 threads or greater) runs faster, and it does not have much difference when threads number is greater than 8 on my computer. (size 2 million)

