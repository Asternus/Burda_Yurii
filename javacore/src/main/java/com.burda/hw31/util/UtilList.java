package com.burda.hw31.util;

import java.util.List;

public class UtilList {
    private int max;

    public List<Integer> getListOfFirstPart(List<Integer> integerList) {
        max = integerList.subList(0, integerList.size() / 2).size();
        return integerList.subList(0, integerList.size() / 2);
    }

    public List<Integer> getListOfSecondPart(List<Integer> integerList) {
        return integerList.subList(max, integerList.size());
    }

}
