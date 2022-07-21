public class Interface {
}


//    인터페이스 만들기
//인터페이스: 서로 관계가 없는 물체들이 상호 작용을 하기 위해서 사용하는 장치나 시스템
//        인터페이스 정의하는 방법
//        추상 메소드와 상수를 정의 할 수 있다.
//public interface TV{
//    public int MAX_VOLUME = 100;
//    public int MIN_VOLUME = 0;
//
//    public void turnOn();
//    public void turnOff();
//    public void changeVolume(int volume);
//    public void changeChannel(int channel);
//}
//    인터페이스에서 변수를 선언하면 컴파일시 자동으로 아래와 같이 바뀐다.
//
//public static final int MAX_VOLUME = 100;
//public static final int MIN_VOLUME = 0;
//        인터페이스에서 정의된 메소드는 모두 추상 메소드이다. 위에서 선언된 모든 메소드는 컴파일 시에 다음과 같이 자동으로 변경된다.
//
//public abstract void on();
//public abstract void off();
//public abstract void volume(int value);
//public abstract void channel(int number);

//인터페이스는 사용할때 해당 인터페이스를 구현하는 클래스에서 implements 키워드를 이용한다.
//public class LedTV implements TV{
//    public void on(){
//        System.out.println("켜다");
//    }
//    public void off(){
//        System.out.println("끄다");
//    }
//    public void volume(int value){
//        System.out.println(value + "로 볼륨조정하다.");
//    }
//    public void channel(int number){
//        System.out.println(number + "로 채널조정하다.");
//    }
//}
//    인터페이스가 가지고 있는 메소드를 하나라도 구현하지 않는다면 해당 클래스는 추상클래스가 된다.(추상클래스는 인스턴스를 만들 수 없음)
//
//public class LedTVExam{
//    public static void main(String args[]){
//        TV tv = new LedTV();
//        tv.on();
//        tv.volume(50);
//        tv.channel(6);
//        tv.off();
//    }
//}
//참조변수의 타입으로 인터페이스를 사용할 수 있다. 이 경우 인터페이스가 가지고 있는 메소드만 사용할 수 있다.
//만약 TV인터페이스를 구현하는 LcdTV를 만들었다면 위의 코드에서 new LedTV부분만 new LcdTV로 변경해도 똑같이 프로그램이 동작할 것다. 동일한 인터페이스를 구현한다는 것은 클래스 사용법이 같다는 것을 의미한다.
//클래스는 이러한 인터페이스를 여러개 구현할 수 있다.
//


// 인터페이스란?
//협업자 상호간에 구체적인 약속을 하면 된다. 특히 그 약속을 코드 안에서 할 수 있다면 참 좋을 것이다. 그렇다. 인터페이스가 필요한 순간이다.
//이렇게 해서 만들어진 코드를 보자. 아래는 약속을 정의하고 있는 인터페이스이다.
//
//package org.opentutorials.javatutorials.interfaces.example2;
//
//public interface Calculatable {
//    public void setOprands(int first, int second, int third) ;
//    public int sum();
//    public int avg();
//}
//다음은 인터페이스를 구현한 가짜 클래스를 임시로 사용해서 만든 에플리케이션이다.
//
//package org.opentutorials.javatutorials.interfaces.example2;
//class CalculatorDummy implements Calculatable{
//    public void setOprands(int first, int second, int third){
//    }
//    public int sum(){
//        return 60;
//    }
//    public int avg(){
//        return 20;
//    }
//}
//public class CalculatorConsumer {
//    public static void main(String[] args) {
//        CalculatorDummy c = new CalculatorDummy();
//        c.setOprands(10, 20, 30);
//        System.out.println(c.sum()+c.avg());
//    }
//}
//    다음 코드는 인터페이스에 따라서 구현된 클래스이다.
//
//package org.opentutorials.javatutorials.interfaces.example2;
//
//class Calculator implements Calculatable {
//    int first, second, third;
//    public void setOprands(int first, int second, int third) {
//        this.first = first;
//        this.second = second;
//        this.third = third;
//    }
//    public int sum() {
//        return this.first + this.second + this.third;
//    }
//    public int avg() {
//        return (this.first + this.second + this.third) / 3;
//    }
//}
//    이제 해야 할 일은 가짜 클래스인 CalculatorDummy를 실제 로직으로 교체하면 된다.
//
//package org.opentutorials.javatutorials.interfaces.example2;
//public class CalculatorConsumer {
//    public static void main(String[] args) {
//        Calculator c = new Calculator();
//        c.setOprands(10, 20, 30);
//        System.out.println(c.sum()+c.avg());
//    }
//}
//이렇게해서 인터페이스를 이용한 협업에 대해서 알아봤다. 인터페이스를 이용해서 서로가 동일한 메소드를 만들도록 규약을 만들어서 공유한 결과 각자가 상대의 일정이나 구현하는 방식에 덜 영향을 받으면서 에플리케이션을 구축 할 수 있었다.