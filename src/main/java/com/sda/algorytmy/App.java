package com.sda.algorytmy;
import java.util.Random;

public class App 
{
    public static void main( String[] args ) throws InstantiationException{
        Random random = new Random();
        int max = 5000;
        int min = -5000;

        // stworzyc tablice o rozmiarze 1000, ktora bedzie zawierala
        // liczby losowe z zakresu -5000 do 5000

               int[] tab = new int[10000];
               long starTime = System.currentTimeMillis();
               for (int i=0; i<tab.length; i++){
                   int randomNumber = random.nextInt(max - min +1) + min;
                   tab[i] = randomNumber;
               }
               long endTime = System.currentTimeMillis();
               long totalTime = endTime - starTime;
               System.out.println("Czas wykonywania: " + totalTime);
        }
    }




