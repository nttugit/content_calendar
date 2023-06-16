package com.nttu.contentcalendar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List names = Arrays.asList("Reflection","Collection","Stream");
        ArrayList<String> namesArr = new ArrayList<>();
        namesArr.add("Reflection");
        namesArr.add("Collection");
        namesArr.add("Stream");
        List result = namesArr.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        for(Object e : result){
            System.out.println(e.toString());
        }
    }
}
