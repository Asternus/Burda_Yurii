package com.burda.hw15.task1;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(10);
        myList.add(12);
        myList.add(24);
        myList.add(41);
        System.out.println(myList);
        System.out.println(myList.getFromLast(41));
    }
}
