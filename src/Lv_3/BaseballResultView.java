package Lv_3;

import java.util.ArrayList;

public class BaseballResultView {

    public void baseballResultView() {

        ArrayList<Integer> list = BaseballResultSave.getList();

        System.out.println("==========================");
        System.out.println("< 게임 기록 보기 >");
        for(int i = 0; i<list.size(); i++){
            System.out.println((i + 1) +" 번째 게임 : 진행 횟수 - " + list.get(i));
        }
        System.out.println("==========================");
    }
}
