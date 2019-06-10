package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer [] newArray = new Integer[array1.length+array2.length];
        System.arraycopy(array1,0,newArray,0,array1.length);
        System.arraycopy(array2,0,newArray,0,array2.length);

        return newArray;

    }

    public Integer[] rotate(Integer[] array, Integer index) {


        return null;
    }



    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        int count =0;

        for (int i=0; i<=array1.length-1;i++) {
            if (array1[i] == valueToEvaluate) {
                count ++;
            }
        }
        for (int i=0;i<array2.length-1;i++) {
            if (array2[i] == valueToEvaluate) {
                count ++;
            }
        }

        return count;
    }

    public Integer mostCommon(Integer[] array) {
        // sort your array first
        Arrays.sort(array);

        int maxCount = 1, res = array[0];
        int currCount = 1;
        int n =1;

        for (int i = 1; i < array.length - 1; i++) {
            if (currCount > maxCount) {
                maxCount = currCount;
                res = array[i - 1];
            }
            currCount = 1;
        }


        return res;
    }


        }




