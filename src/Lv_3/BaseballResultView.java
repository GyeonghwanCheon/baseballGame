package Lv_3;

import java.util.ArrayList;

public class BaseballResultView {

    public void baseballResultView() {

        ArrayList<Integer> list = BaseballResultSave.getList();
        // 새롭게 생성을 하면 데이터가 날아가기 떄문에 getlist 로 불러온다.

        System.out.println("==========================");
        System.out.println("< 게임 기록 보기 >");
        for(int i = 0; i<list.size(); i++){
            System.out.println((i + 1) +" 번째 게임 : 진행 횟수 - " + list.get(i));
        }
        System.out.println("==========================");
    }
}
