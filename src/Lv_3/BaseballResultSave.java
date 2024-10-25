package Lv_3;

import java.util.*;

public class BaseballResultSave {
    static ArrayList<Integer> list = new ArrayList<>();


    public static void baseballResultSave(int input) {
         list.add(input); // 게임 진행 횟수를 넘겨받아서 순서대로 리스트에 저장.
    }

    public static ArrayList<Integer> getList() {
        return list; // 정적 메소드를 사용했기에 getter 사용하여 불러올 수 있게한다.
    }
}
