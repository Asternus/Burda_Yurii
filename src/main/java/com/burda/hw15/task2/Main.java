package com.burda.hw15.task2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(getTreeSet().toString());
    }

    public static TreeSet getTreeSet() {
        final Comparator<Box> box = new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                if (o1.getValue().equals(0) || o2.getValue().equals(0)) {
                    return o1.getValue().compareTo(o2.getValue());
                } else
                    return o2.getValue().compareTo(o1.getValue());
            }
        };
        TreeSet<Box> treeSet = new TreeSet<>(box);
        treeSet.add(new Box(11));
        treeSet.add(new Box(22));
        treeSet.add(new Box(0));
        treeSet.add(new Box(77));
        treeSet.add(new Box(88));

        Iterator<Box> itr = treeSet.iterator();
        while (itr.hasNext()) {
            itr.next();
        }
        return treeSet;
    }
}
