package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {


    public Map<String,String> map1 = new HashMap<>();

    public void add(String path, String controller) {


        this.map1.put(path, controller);


    }

    public Integer size() {




        return this.map1.size();
    }

    public String getController(String path) {




        return this.map1.get(path);
    }

    public void update(String path, String studentController) {


        this.map1.put(path,studentController);

    }

    public void remove(String path) {

        this.map1.remove(path);
    }
    @Override
    public String toString() {
        StringBuilder string1 = new StringBuilder();
        for (String key : this.map1.keySet()) {
            String value = this.map1.get(key);
           string1.append(key + value + '\n');
        }
        return string1.toString();
    }
}
