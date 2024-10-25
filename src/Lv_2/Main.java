package Lv_2;

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
                case 2: // '2' 게임 기록 보기 구현 X --> LV_3
                    System.out.println("구현되지 않았습니다.");
                    break;
                case 3: // '3' 게임 종료
                    System.out.println("게임을 종료합니다. 감사합니다 :)");
                    flag = false;
                    break;
            }
        }

    }
}