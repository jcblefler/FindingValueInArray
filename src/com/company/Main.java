package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(17);
        numList.add(29);
        numList.add(11);
        numList.add(17);
        numList.add(39);
        numList.add(50);
        numList.add(1);
        numList.add(17);
        numList.add(26);


//    Finds if value is equal to 17 and will print it out everytime it is found
        for (int i : numList){

            if (i == 17){
                System.out.println(i + " is in the ArrayList.");
            }

        }


    // Finds values of 17 and prints out how many times it was found
        int count = 0;

        for (int i : numList){

            if (i == 17){
                count++;
            }

        }
        System.out.println("17 was found " + count + " times.");

    }
}
