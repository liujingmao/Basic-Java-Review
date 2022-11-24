package com.cmb.java.array;


/*
   1. sum of all arry
   2. bianlie element
   3. left sum and ring sum
   4. method to calculate the sum of leftsum and rightsum every element
   5. compare leftsum and rightsum, if equal, return index of element

 */

public class Sollution {

    public static int leftsum(int[] nums,int index){

        if (index<0||index>nums.length){
            System.out.println("参数不合法");
        }

        int leftsum = 0;
        for (int i = 0;i<index;i++){
            leftsum+=nums[i];
        }
        return leftsum;
    }

    public static int rightsum(int[] nums,int index){

        if (index<0||index>nums.length){
            System.out.println("参数不合法");
        }

        int rightsum =0;
        for (int j =index+1;j<nums.length;j++){

            rightsum+=nums[j];

        }

        return rightsum;


    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,3,2,1};



        Sollution sollution = new Sollution();


        /*System.out.println(sollution.leftsum(nums,2));

        System.out.println(sollution.rightsum(nums,2));

        int totalsum = sollution.sumArray(nums);

        System.out.println("Array Total sum:"+totalsum);

        int leftsum = sollution.sumArray(nums,2);

        int rightsum = sollution.sumArray(nums)-sollution.sumArray(nums,2)-nums[2];

        System.out.println("right sum:"+ rightsum);

        System.out.println("Left Sum:"+ leftsum);*/

        int minindex = sollution.findMiddleIndex(nums);

        System.out.println("Mid index:"+ minindex);

    }

       public int  sumArray(int[] nums){

           int s = 0;
           for (int i = 0;i<=nums.length-1;i++){
               s += nums[i];
           }
           return s;
       }

       public int sumArray(int[] nums,int index){
           if (index<0||index>nums.length){
               System.out.println("参数不合法");
           }

           int leftsum = 0;

           for (int i = 0;i<index;i++){

               leftsum+=nums[i];

           }

           return leftsum;
       }


        public int findMiddleIndex(int[] nums) {

           int minIndex=0;

           for (int i = 0;i<nums.length;i++){
               int lefts = leftsum(nums,i);
               int rights = rightsum(nums,i);
               if (lefts==rights){
                   minIndex = i;
               }
           }

           return minIndex;
        }
}
