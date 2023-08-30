package com.cmb.java;

public class Sollutionv2 {
    public static void main(String[] args) {

        int[] distance = {1,2,3,4};

        Sollutionv2 sollutionv2 = new Sollutionv2();

        int b = sollutionv2.distance(distance,0,3);

        System.out.println(b);

    }

    public int distance(int [] distance,int start,int dest){

        int sum =0;
        for (int i=0;i<distance.length;i++){
            sum+= distance[i];
        }
       int index_lenght = Math.abs(dest - start);
        int dis_1 = 0;
        for (int j=start;j<index_lenght;j++){
            dis_1+=distance[start++];
        }

        int dis_2 = sum-dis_1;

        if(dis_2>dis_1){
            return dis_1;
        } else {
            return dis_2;
        }

    }
}
