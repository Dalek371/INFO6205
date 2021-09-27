/*
  (c) Copyright 2018, 2019 Phasmid Software
 */
package edu.neu.coe.info6205.sort.elementary;

import edu.neu.coe.info6205.sort.BaseHelper;
import edu.neu.coe.info6205.sort.Helper;
import edu.neu.coe.info6205.sort.SortWithHelper;
import edu.neu.coe.info6205.util.Benchmark;
import edu.neu.coe.info6205.util.Benchmark_Timer;
import edu.neu.coe.info6205.util.Config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort<X extends Comparable<X>> extends SortWithHelper<X> {

    /**
     * Constructor for any sub-classes to use.
     *
     * @param description the description.
     * @param N           the number of elements expected.
     * @param config      the configuration.
     */
    protected InsertionSort(String description, int N, Config config) {
        super(description, N, config);
    }

    /**
     * Constructor for InsertionSort
     *
     * @param N      the number elements we expect to sort.
     * @param config the configuration.
     */
    public InsertionSort(int N, Config config) {
        this(DESCRIPTION, N, config);
    }

    public InsertionSort(Config config) {
        this(new BaseHelper<>(DESCRIPTION, config));
    }

    /**
     * Constructor for InsertionSort
     *
     * @param helper an explicit instance of Helper to be used.
     */
    public InsertionSort(Helper<X> helper) {
        super(helper);
    }

    public InsertionSort() {
        this(BaseHelper.getHelper(InsertionSort.class));
    }

    /**
     * Sort the sub-array xs:from:to using insertion sort.
     *
     * @param xs   sort the array xs from "from" to "to".
     * @param from the index of the first element to sort
     * @param to   the index of the first element not to sort
     */
    public void sort(X[] xs, int from, int to) {
        final Helper<X> helper = getHelper();

        // TO BE IMPLEMENTED
        for (int i = from + 1; i < to; i++) {
            //set the index
            int temp = i - 1;
            //if index>target, swap
            while (temp >= 0 && !helper.less(xs[temp], xs[temp + 1])) {
                helper.swap(xs, temp, temp + 1);
                temp--;
            }
        }
    }

    public static final String DESCRIPTION = "Insertion sort";

    public static <T extends Comparable<T>> void sort(T[] ts) {
        new InsertionSort<T>().mutatingSort(ts);
    }

    //Benchmark Test
    public static void main(String[] args) throws IOException {
        int RunCount = 1000;
        for(int k = 1000; k<=10000; k=k+1000) {
            int n = k;
            BaseHelper<Integer> helper = new BaseHelper<>("InsertionSort", n, Config.load(InsertionSort.class));
            SortWithHelper<Integer> sorter = new InsertionSort<>(helper);
            Benchmark<Integer[]> benchmarkTimer = new Benchmark_Timer<>("InsertionSort", sorter::preProcess, sorter::sort);

            //random
            double runRandom = benchmarkTimer.run(helper.random(Integer.class, r -> r.nextInt(n)), RunCount);
            System.out.println("Random " + n + " times running," + " runtime: " + runRandom);

            // ordered
            Integer[] orderedArray = new Integer[n];
            for (int i = 0; i < n; i++) {
                orderedArray[i] = i;
            }

            double runOrdered = benchmarkTimer.run(orderedArray, RunCount);
            System.out.println("Ordered " + n + " times running," + "runtime: " + runOrdered);

            // partially ordered
            Integer[] partiallyOrderedArray = helper.random(Integer.class, r -> r.nextInt(n));
            Arrays.sort(partiallyOrderedArray, partiallyOrderedArray.length / 3, partiallyOrderedArray.length * 2 / 3);

            double runPartially = benchmarkTimer.run(partiallyOrderedArray, RunCount);
            System.out.println("Partially ordered " + n + " times running," + "runtime: " + runPartially);

            // reverse ordered
            Integer[] reversOrderedArray = new Integer[n];
            for (int i = 0; i < n; i++) {
                reversOrderedArray[i] = n - i - 1;
            }

            double runReverse = benchmarkTimer.run(reversOrderedArray, RunCount);
            System.out.println("Reversed " + n + " times running," + "runtime: " + runReverse);
        }
    }
}
