package com.sda.algorytmy;
import java.util.Arrays;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        Random random = new Random();

        int max = 5000;

        int min = -5000;

        int[] tab = new int[200];

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < tab.length; i++) {

            int randomMunber = random.nextInt(max - min + 1) - max;

            tab[i] = randomMunber;

        }

        //przed sortowaniem

        System.out.println(Arrays.toString(tab));

        long endTime = System.currentTimeMillis();

        long totaTime = endTime - startTime;

        System.out.println("Czas wykonania  " + totaTime);

        startTime = System.currentTimeMillis();

        sort(tab);

        endTime = System.currentTimeMillis();

        totaTime = endTime - startTime;

        System.out.println("czas sortowania " + totaTime);

        //po sortowaniu

        System.out.println(Arrays.toString(tab));
    }

    public static int[] sort(int[] tab){

        int temp =0;

        for (int j = 0; j < tab.length ; j++) {

            for (int i = 0; i < tab.length - 1; i++) {

                if (tab[i] > tab[i + 1]) {

                    temp = tab[i + 1];

                    tab[i + 1] = tab[i];

                    tab[i] = temp;

                }
            }
        }

        return tab;

    }



}