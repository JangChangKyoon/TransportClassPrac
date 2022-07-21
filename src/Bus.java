import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Bus extends Transport{
    //생성자 : 클래스명과 매소드명이 동일 main함수애서 객채변수 값을 무조건 설정해야만 객채가 생성될 수 있게 해주는 것
    //        리턴타입을 정의하지 않는다.
    // static String[] busList = new String[]{};
    // 매소드 오보로딩 : 매개변수의 유형과 개수가 다르게 하여 같은 이름의 메소드를 여러 개 가질 수 있게하는 기술
    // 매소드 오보라이딩 : 자식 클래스에서 부모클래스 메소드를 재정의하여 사용하는 것
    public Bus (int createNum) { // 생성자_리턴타입이 없음.
        if (num.contains(createNum)) {
            System.out.println("이미 존재합니다.");
        } else{
            num.add(createNum);
        }
        this.defaultState = state.get(1).toString();
    }

    void stateChange () {
        if (defaultState == state.get(0).toString()) {
            defaultState = state.get(1).toString();
        } else {
            defaultState = state.get(0).toString();
        }

        System.out.println("상태를 "+ defaultState+"으로 변경합니다.");
    }



    void passengerIn (int a) {
        if (passengerMax-a < 0) {
            showMessageDialog(null, "최대 승객수 초과.");
        } else {
            System.out.println("승객 " + a + "명 탑승하였습니다.");
            System.out.println("요금은 " + a * 1000 + "원입니다.");
            passengerMax -= a;
            passengerNow += a;
            System.out.println("현재승객수 " + passengerNow + "명입니다.");
            System.out.println("잔여승객수 " + passengerMax + "명입니다.");
        }
    }
    void fuelFillUse(int b) {
        fuelAmount += b;
        System.out.println("주유량 "+b+" 입니다.");
        System.out.println("잔여주유량은 "+fuelAmount+" 입니다.");
        if (fuelAmount <= 10) {
            showMessageDialog(null, "주유가 필요합니다.");
            stateChange ();
        }
    };

    //super.passengerIn2(a);
    //@Override void passengerIn2(int a) {
    //}
    //super(); //기본형은 부모의 생성자도 함께 생성됨, 부모를 호출하는 것
    //super("부모생성자파라미터"):부모가 기본생성자가 있으면 괜찮지만, 부모의 생성자에 파라미터가 있으면, 따로 생성을 해주어야 함.

    public Bus (String createNum1, int createNum2) {}; // 생성자 오버로등 : 생상자 중복 가능
    public Bus () {
        //this("이름없음", 0); //this를 이용하여 위 파라미터 활용가능
    } // 빈생성자도 생성자오버로등 가능


}