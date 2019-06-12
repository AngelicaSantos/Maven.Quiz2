package com.zipcodewilmington.assessment2.part2;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListUtility {
    List<Integer> list;

    public ListUtility(){
        list = new ArrayList<>();
    }

    public Boolean add(Integer i) {

        return list.add(i);
    }

    public Integer size() {

        return list.size();
    }

    public List<Integer> getUnique() {

        List<Integer> unique= new ArrayList<>();
        for (int i=0; i<list.size();i++) {
            if(!unique.contains(list.get(i)));
            unique.add(Integer.parseInt(list.get(i).toString()));
        }

        return unique;
    }

    public String join() {

        String joi = "";
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1)
                joi += list.get(i).toString();
            else
                joi += list.get(i).toString()+ ", ";

        }
        return joi;
    }


    public Integer mostCommon() {

        Integer [] comm = new Integer[list.size()];
        for (int i=0; i<list.size(); i++) {
            comm[i] = list.get(i);
        }
        return ArrayUtility.mostCommon(comm);
    }

    public Boolean contains(Integer valueToAdd) {

        return list.contains(valueToAdd);
    }
}
