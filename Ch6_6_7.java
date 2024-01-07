public class Ch6_6_7 {
    public static void main(String[] args) {
        Tv t;               // Tv 인스턴스를 참조하기 위한 변수 t를 선언
        t = new Tv();       // Tv 인스턴스를 생성한다.
        t.channel = 7;
        t.channelDown();
        t.channelDown();
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
        
        Tv t2 = new Tv();   // line 3,4 한번에 표현
        t2.channel = 22;
    }
}

class Tv {
    // Tv의 속성(member variable)
    String color;
    boolean power;
    int channel;

    // Tv의 기능(method)
    void power() {power = !power; };
    void channelUp() {++channel; };
    void channelDown() {--channel; };
}