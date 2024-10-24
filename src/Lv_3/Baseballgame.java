package Lv_3;

import java.util.*;

public class Baseballgame {
    BaseballGameDisplay hint = new BaseballGameDisplay();
    private static int[] ran_num = new int[3];

    public Baseballgame() {

        Integer[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> arrlist =Arrays.asList(arr);

        Collections.shuffle(arrlist);
        arrlist.toArray(arr);

        for(int i = 0; i < 3; i++) {
            ran_num[i] = arrlist.get(i);
        }
        System.out.println(Arrays.toString(ran_num));
    }


    public void play() {
        int playNum = 0;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("3자리 숫자를 입력하시오 : ");
            int input = sc.nextInt();

            if (input < 100 || input > 999) { // 입력 숫자가 2자리 경우 다시 입력
                System.out.println("3자리를 입력해주세요!");
                continue;
            }

            flag = validateInput(input);
            // num을 return 받아 스트라이크와 볼 갯수 저장.
            int strike = countStrike(input);
            int ball = countBall(input);
            hint.displayHint(strike, ball);
            if (strike == 3) { // 3 strike의 경우 반복문 종료.
                flag = false;
            }
            playNum++;
        }
        System.out.println("게임 진행 횟수 : " + playNum);
        BaseballResultSave.baseballResultSave(playNum);
    }




    protected boolean validateInput(int input) {
        //각 자릿수 0이 아니고 중복 숫자 X, 문자 X
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (input > 0) { //각 자릿 수 숫자를 하나씩 저장.
            list.add(input % 10);
            input /= 10;
        }

        if (list.get(0) == 0 || list.get(1) == 0 || list.get(2) == 0) {
            // 각 자릿 수가 0인지 확인하기
            System.out.println("0 불가!");
            return true;
        } else if (list.get(0) == list.get(1) || list.get(0) == list.get(2) || list.get(1) == list.get(2)) {
            //각 자릿 수 마다 중복되는 숫자가 있는지 확인
            System.out.println("중복 불가!");
            return true;
        }
    return true;
    }


    private int countStrike(int input) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num = 0;

        while (input > 0) { // 입력 받은 숫자를 자릿 수 마다 하나씩 저장
            list.add(input % 10);
            input /= 10;
        }
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == ran_num[list.size()-i-1]) { // 정답 숫자와 입력 한 숫자가 같은 위치에 같은 숫자면 strike
                num++;
            }
        }
        return num;
    }


    private int countBall(int input) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num = 0;
        while (input > 0) { // 입력 받은 숫자를 자릿 수 마다 하나씩 저장
            list.add(input % 10);
            input /= 10;
        }

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if(list.get(list.size()-i-1) == ran_num[j]) { //하나씩 비교하며 값은 같으나, 위치가 다를 때 마다 ball
                    if(i != j) {
                        num++;
                    }
                }
            }
        }
        return num;
    }
}