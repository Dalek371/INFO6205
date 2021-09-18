# Program Structure & Algorithms 2021 Fall

## Assignment No.1

#### Jing Dai NUID 001569042



### 1、Task

Imagine a drunken man who, starting out leaning against a lamp post in the middle of an open space, 
   takes a series of steps of the same length: 1 meter . 
   The direction of these steps is randomly chosen from North, South, East or West. 
   **After** **n** **steps, how far (\*d\*), generally speaking, is the man from the lamp post?** 
   Note that *d* is the Euclidean distance of the man from the lamp-post. 
   **Deduce the relationship**.

Please find the code on

https://github.com/Dalek371/INFO6205/tree/Fall2021/src/main/java/edu/neu/coe/info6205/randomwalk

### 2、Relationship Conclusion

​		
$$
d = \sqrt{n}
$$
​		Just a approximation of the result.

### 3、Evidence

#### 		1）Output & Graphical Representation

​				1.1 Output Screenshot

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/assignment01/1.PNG)

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/assignment01/2.PNG)

​				Then we put all the points into the coordinate system with (n,d) as (x,y)

​				We will easily get a set of points that is very similar and close to the function of **y=x²** as the following graph

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/assignment01/function.PNG)



#### 		2）Mathematics deduction

To get to the conclusion of 
$$
d = \sqrt{n}
$$
We consider the drunken man walking in a coordinate system and the lamp spot as the origin, 

then we will get his position as (x,y)

and the distance will be 
$$
d=\sqrt{x^2+y^2}
$$
And we assume him walking on

​					West-East direction          (x axis) for **i** steps

​					North-South direction     (y axis) for **k** steps
$$
n = i+k
$$
Then we will have 
$$
\begin{cases} X = X1+X2+X3...+Xi \\Y= Y1+Y2+Y3...+Yk\end{cases}
$$
If we see Xa/Ya represent the steps as -1/1 for opposite direction.
$$
X^2=(X_1+X_2+X_3...+X_i)^2\\
\   =X_1^2+X_1X_2+X_1X_3+...+X_1X_i\\
\ \ \ \ \ \ \ \ \ \ +X_2^2+X_1X_2+X_2X_3+...+X_2X_i\\
\ \ \ \ \ \ \ \ \ \ +X_3^2+X_1X_3+X_2X_3+...+X_3X_i\\
...\\\ \ \ \ \ \ \ \ \ \ +Xi^2+X_1X_i+X_2X_i+...+X_{i-1}X_i\\
=(X1^2+X2^2+X3^2...+Xi^2)+2(X_1X_2+X_1X_3+X_1X_4...+X_{i-1}X_i)
$$

$$
\because Xa = -1 \ or\  1, \\Xa^2  = 1\\
\therefore (X1^2+X2^2+X3^2...+Xi^2) = 1*i =i
$$
​				Each XaXa pair will be within the following types:
$$
\begin{cases} 1,\ \ \ -1\ =-1 \\1,\ \ \ \ \ \ 1\ \ \ =1\\-1,\ \ \ 1\ \ \ =-1\\-1,\ -1\ =1\end{cases}\\
$$
​				and the probability of these pairs will be the same because it's **Random**

​				On average will be 0,
$$
\therefore 2(X_1X_2+X_1X_3+X_1X_4...+X_{i-1}X_i) =0
$$
​				Therefore,
$$
X^2=(X1^2+X2^2+X3^2...+Xi^2)+2(X_1X_2+X_1X_3+X_1X_4...+X_{i-1}X_i)=i+0 =i
$$
​				the same procedure may be easily adapted to Y²
$$
Y^2=(Y1^2+Y2^2+Y3^2...+Yk^2)+2(Y_1Y_2+Y_1Y_3+Y_1Y_4...+Y_{k-1}Y_k)=k+0 =k
$$
So, we can approximately deduce that 
$$
d = \sqrt{X^2 +Y^2} =\sqrt{i+k}=\sqrt{n}
$$
**QED**

### 4、Unit tests result

![image](https://github.com/Dalek371/INFO6205/blob/Fall2021/src/main/java/appendix/assignment01/test.PNG)
