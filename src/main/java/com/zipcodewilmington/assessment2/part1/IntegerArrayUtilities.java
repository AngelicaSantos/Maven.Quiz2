package com.zipcodewilmington.assessment2.part1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        return true;
    }

    public Integer[] range(int start, int stop) {


        return null;

    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        int sum = 0;
        for (int i =0; i<2; i++) {
            sum += array [i];
        }
        return sum;
    }


    public Integer getProductOfFirstTwo(Integer[] array) {
        int product = 1;
        for (int i =1; i<=array.length-1; i++) {
            product *= array [i];
        }
        return product;
    }
}
