package com.burda.hw15.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(buildTreeSet(addBox()).toString());
    }

    public static Comparator<Box> buildCompare() {
        final Comparator<Box> box = new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                if ((o1 == null) || (o2 == null)) {
                    throw new IllegalArgumentException();
                }
                if (o1.getValue().equals(0) || o2.getValue().equals(0)) {
                    return o1.getValue().compareTo(o2.getValue());
                } else
                    return o2.getValue().compareTo(o1.getValue());
            }
        };
        return box;
    }

    public static List<Box> addBox() {
        List<Box> lst = new ArrayList<>();
        lst.add(new Box(77));
        lst.add(new Box(15));
        lst.add(new Box(88));
        lst.add(new Box(11));
        lst.add(new Box(0));
        return lst;
    }

    public static TreeSet<Box> buildTreeSet(List<Box> list) {
        TreeSet<Box> treeSet = new TreeSet<>(buildCompare());
        treeSet.addAll(list);
        return treeSet;
    }
}


