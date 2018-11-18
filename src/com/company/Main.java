package com.company;


public class Main {

    public static void main(String[] args) {
        short[] array = new short [20];
        double x = 0;
        System.out.println("Массив:");
        for (int i = 0; i<20; i++) {
            array[i]=(short)Math.round(20*Math.random());
            System.out.print(array[i]+", ");
        }
        for (int i = 0; i<20; i++) {
            x+=array[i];
        }
        x/=20;
        System.out.println("\nСреднее арифметическое: " + x);
    }
}