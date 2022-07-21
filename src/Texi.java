import java.util.HashMap;
import static javax.swing.JOptionPane.showMessageDialog;

public class Texi extends Transport{
    int fee;


    public Texi (int createNum) { // 생성자_리턴타입이 없음.
        if (this.num.contains(createNum)) {
            System.out.println("이미 존재합니다.");
        } else{
            this.num.add(createNum);
        }
        this.defaultState = state.get(2).toString();
        System.out.println("잔여주유량은 "+this.fuelAmount+" 입니다.");
        System.out.println("상태는 "+this.defaultState+" 입니다.");
    }

    void fuelFillUse(int b) {
        fuelAmount += b;
        System.out.println("주유량 "+b+" 입니다.");
        System.out.println("잔여주유량은 "+fuelAmount+" 입니다.");
        if (fuelAmount <= 10) {
            showMessageDialog(null, "주유가 필요합니다.");
        }
        System.out.println("누적요금 : "+fee);
    };

    void passengerIn (int a) {
        this.passengerNow += a;
        if(this.passengerNow >= 5) {
            this.passengerNow -= a;
            showMessageDialog(null, "탑승인원 초과");
        } else if (defaultState == state.get(2).toString()) {
            System.out.println("승객탑승 -> 운행 가능합니다.");
            defaultState = state.get(1).toString();
            System.out.println("택시상태 : "+defaultState);
            this.passengerMax -= a;
            System.out.println("탑승인원 : "+a+"/ 현재승객 : "+this.passengerNow+"/ 잔여자리 : "+this.passengerMax);
        } else if(defaultState==state.get(1).toString()||defaultState==state.get(3).toString()){
            System.out.println("운행이 불가합니다.");
        } else if(this.passengerNow > 4){
            System.out.println("탑승인원이 초과했습니다.");
        }
    }

    void passengerOut (int a) {
        if (defaultState == state.get(1).toString() && passengerNow >= 1) {
            System.out.println("승객하차 -> 운행 대기합니다.");
            defaultState = state.get(2).toString();
            System.out.println("택시상태 : " + defaultState);
            passengerNow -= a;
            passengerMax += a;
            System.out.println("하차인원 : " + a + "/ 현재승객 : " + passengerNow + "/ 잔여자리 : " + passengerMax);
        }
    }
    void feeCharge(String destine, int distant){
        int defaultDistance = 5; //기본거리
        int defaultFee=defaultDistance*1000;
        int finalFee = 1000*distant-defaultFee;
        this.fee += finalFee;
        System.out.println("기본요금 : "+defaultFee);
        System.out.println("요금 : "+finalFee);
        System.out.println("목적지 : "+destine);
        System.out.println("목적지까지 거리 : "+distant);
    }
}




//    void passengerIn (int a) {
//        if (passengerMax-a < 0) {
//            System.out.println("수용인원을 초과하였습니다.");
//        } else {
//            System.out.println("승객 " + a + "명 탑승하였습니다.");
//            System.out.println("요금은 " + a * 1000 + "원입니다.");
//            passengerMax -= a;
//            passengerNow += a;
//            System.out.println("현재승객수 " + passengerNow + "명입니다.");
//            System.out.println("잔여승객수 " + passengerMax + "명입니다.");
//        }
//    }


//    void tellDestineDistant(String destine, int distant) {
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put(destine, distant);
//        System.out.println("승객Tell / 목적지 : "+ destine+"/거리: "+distant);
//    }






