package Lv_2;

public class BaseballGameDisplay {
    public void displayHint(int strike, int ball) {
        if(strike == 0 && ball == 0){
            // 스트라이크와 볼이 해당되지 않는 경우
            System.out.println("out 입니다!");
            System.out.println("=====================");
        } else if(strike == 3){
            // 정답을 맞춘 경우
            System.out.println("정답을 맞추셨습니다! 승리!!");
            System.out.println("=====================");
        } else{
            // 스트라이크와 볼 갯수 알려주기
            System.out.println(strike + " 스트라이크, " + ball +" ball 입니다");
            System.out.println("=====================");
        }
    }
}
