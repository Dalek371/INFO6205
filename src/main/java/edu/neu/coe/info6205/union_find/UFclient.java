package edu.neu.coe.info6205.union_find;

import java.util.Random;

public class UFclient {
    public static int count(int n) {
        int connections = 0;
        UF_HWQUPC uf_hwqupc = new UF_HWQUPC(n);
        //Loop until all sites are connected
        while(uf_hwqupc.components()>1) {
            Random r = new Random();
            int i = r.nextInt(n);
            int j = r.nextInt(n);
            uf_hwqupc.connect(i,j);
            connections++;
        }
        return connections;
    }

    public static void main(String[] args) {
        for(int i = 5000;i<=100000;i=i+5000){
            int sum = 0;
            for(int j=0;j<100;j++){
                int operation = count(i);
                sum +=operation;
            }
            int average = sum/100;
            System.out.println("Count sites: "+i+", number of runs: "+average);
        }
    }
}
