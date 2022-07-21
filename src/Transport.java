import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Transport {
    static ArrayList num = new ArrayList<>(); // 고유번호
    //요소
    int fuelAmount = 100;
    int speed = 0;
    int passengerMax;
    int passengerNow;

    HashMap<String, String> map = new HashMap<>();
    String destination;
    int defaultDistance; // main에서 지정
    //상태설정
    String[] data = {"차고지행", "운행중", "일반", "탑승불가"};
    ArrayList state = new ArrayList(Arrays.asList(data));
    String defaultState = "";


    void speedChange(int speed){
        this.speed += speed;
        System.out.println("현재속도 : " + this.speed +" / "+  "증가속도 : " + speed);
    };
}

//추상클래스
//public abstract class Bird{
//    public abstract void sing();
//
//    public void fly(){
//        System.out.println("날다.");
//    }
//}
//추상 클래스는 클래스 앞에 abstract 키워드를 이용해서 정의한다.
//추상 클래스는 미완성의 추상 메소드를 포함할 수 있다.
//추상 메소드란, 내용이 없는 메소드 이다. 즉 구현이 되지 않은 메소드이다.
//추상 메소드는 리턴 타입 앞에 abstract라는 키워드를 붙여야 한다.
//추상 클래스는 인스턴스를 생성할 수 없다.
