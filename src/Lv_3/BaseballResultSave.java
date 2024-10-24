package Lv_3;

import java.util.*;

public class BaseballResultSave {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void baseballResultSave(int input) {
         list.add(input);
    }

    public static ArrayList<Integer> getList() {
        return list;
    }
}
