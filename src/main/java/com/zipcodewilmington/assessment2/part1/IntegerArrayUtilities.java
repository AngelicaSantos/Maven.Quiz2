package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        if (array.length % 2==0)
        return true;
        else {
            return false;
        }
    }

    public Integer[] range(int start, int stop) {
        List<Integer> x = new ArrayList<>();
        for (int i = start; i <= stop; i++)
        {
            x.add(i);
        }

        Integer[] y = new Integer[x.size()];
        for (int i =0; i < x.size(); i++) {
            y[i] = x.get(i);
        }
        return y;

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
