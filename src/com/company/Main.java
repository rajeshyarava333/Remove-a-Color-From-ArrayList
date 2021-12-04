package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> colors=new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");
        Iterator<String> itr=colors.iterator();
        while(itr.hasNext()){
            String color= itr.next();
            if(color.equalsIgnoreCase("blue")){
                itr.remove();
            }
        }
        System.out.println(colors);
    }
}
