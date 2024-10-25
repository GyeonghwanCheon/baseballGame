package Lv_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        boolean flag = true;
        while (flag) {
            System.out.println("환영합니다! 원하시는 번호를 입력해주세요.");
            System.out.println("1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            switch (input) {
                case 1: // '1' 입력 시 게임 시작
                    Baseballgame start = new Baseballgame();
                    start.play();
                    continue;
                case 2: // '2' 입력 시 게임 기록 보기
                    BaseballResultView view = new BaseballResultView();
                    view.baseballResultView();
                    break;
                case 3: // '3' 입력 시 게임 종료
                    System.out.println("게임을 종료합니다. 감사합니다 :)");
                    flag = false;
                    break;
                default: // '1, 2, 3' 이외의 숫자 입력 시 반복문 재시작으로 1, 2, 3 선택지
                    System.out.println("올바른 숫자를 입력해주세요!");
                    System.out.println("=====================");
                    continue;
            }

        }
    }
}