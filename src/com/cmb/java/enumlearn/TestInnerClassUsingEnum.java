package com.cmb.java.enumlearn;



public class TestInnerClassUsingEnum {

    enum Derection{
        EAST,
        SOUTH,
        WEST,
        NORTH
    }

    public static void main(String[] args) {

       // Derection derection = Derection.valueOf("Test");

        Derection derection = Derection.EAST;

        System.out.println(derection);
        System.out.println();

        for (Derection derection1: Derection.values()){
            System.out.println(derection1);
        }

        switch (derection) {

            case EAST:
                System.out.println("东方");
                break;
            case NORTH:
                System.out.println("北方");
                break;
            case WEST:
                System.out.println("西方");
                break;
            case SOUTH:
                System.out.println("南方");
                break;
        }

    }
}
