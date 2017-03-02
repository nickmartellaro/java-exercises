package org.launchcode.java.demos.java4python.exercises;

import java.util.ArrayList;


public class ArrayListExercise {

    public static void main(String[] args) {
        ArrayList<Integer> num_list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            num_list.add(i);
        }

        for (int l : num_list) {
            if (l / 2) {
                sum += l;
            }
        }
        System.out.println(sum);
        }


    }


}