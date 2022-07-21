import static javax.swing.JOptionPane.showMessageDialog;
//showMessageDialog(null, "주유 필요");


public class Main {
    public static void main(String[] args) {

        System.out.println("--------bus-------");
        Bus bus1 = new Bus(1); // 버스 생성
        // Bus(1)이 생성자
        // new 인스턴스를 만드는 연산자
        // Bus bus2 = new Bus(1); // 고유번호 충돌 확인
        bus1.passengerMax = 30; //버스 최대승객수
        bus1.passengerIn(41); // 승객탑승 초과 확인
        bus1.passengerIn(5); // 승객탑승
        bus1.fuelFillUse(-90); // 연료주입
        bus1.speedChange(10);

        System.out.println("--------texi-------");

        Texi texi = new Texi(2);
        texi.passengerMax = 4;//최대탑승객
        texi.passengerIn(2);
        texi.speedChange(4);
        texi.fuelFillUse(20);
        texi.feeCharge("서울역",200);
        System.out.println("누적요금 : "+texi.fee+"원");
        texi.speedChange(-4);
        texi.passengerOut(2);
        texi.passengerIn(5);
        texi.passengerIn(3);
        texi.feeCharge("구로디지털단지역",12);
        texi.fuelFillUse(-110);
    }
}


//부모타입으로 자식객체를 참조하게 되면 부모가 가지고 있는 메소드만 사용할 수 있다. 자식객체가 가지고 있는 메소드나 속성을 사용하고 싶다면 형변환 해야 한다.
//public class BusExam{
//    public static void main(String args[]){
//        Car car = new Bus();
//        car.run();
//        //car.ppangppang(); // 컴파일 오류 발생
//
//        Bus bus = (Bus)car;  //부모타입을 자식타입으로 형변환
//        bus.run();
//        bus.ppangppang();
//    }
//}

