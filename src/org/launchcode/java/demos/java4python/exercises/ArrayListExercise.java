package org.launchcode.java.demos.java4python.exercises;

import java.util.ArrayList;


public class ArrayListExercise {

    public static void main(String[] args) {
        ArrayList<Integer> num_list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 10; i++) {
                num_list.add(i);
        }

        for (int l = 0; l < 10; l++) {
            if (num_list.get(l) % 2 == 0) {
                sum += num_list.get(l);
            }
        }
        System.out.println(sum);
        }


    }



