package com.zipcodewilmington.assessment2.part2;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(array1));
        aList.addAll(Arrays.asList(array2));

        Integer[] newarr = new Integer[aList.size()];
        for (int i=0; i<aList.size();i++) {
            newarr[i] = aList.get(i);
        }

         return newarr;

    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer [] ang = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            if(i+index < array.length)
                ang[i] = array[i+index];
            else
                ang[i] = array[i + index - array.length];
        }
        return ang;


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
//        // sort your array first
//        Arrays.sort(array);
//
//        int maxCount = 1, res = array[0];
//        int currCount = 1;
//        int n =1;
//
//        for (int i = 1; i < array.length - 1; i++) {
//            if (currCount > maxCount) {
//                maxCount = currCount;
//                res = array[i - 1];
//            }
//            currCount = 1;

        Map<Integer,Integer> x = new TreeMap<>();
        for (int i=0; i<array.length;i++) {
            int y = array[i];

            if(x.containsKey(y)) {
                int w =x.get(y);
                w++;
                x.put(y,w);
            }
            else {
                x.put(y,1);
            }
    }
        int max_count = 0, res = -1;

        for(Map.Entry<Integer, Integer> val : x.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }

        return res ;
    }


        }




