/* 
 * class variable vs instance variable
 * 공통속성 | 개별속성
 * 클래스로 인스턴스를 만드는 과정에서 모든 인스턴스가 고정적으로 가져야 하는 값은 class variable, 개별적으로 가져야 하는 값은 instance variable
 */

public class Ch6_12_13 {
    public static void main(String[] args) {
        
        Card c1;
        c1 = new Card();

        c1.kind = "HEART";  // instance variable
        c1.number = 5;      // instance variable

        c1.width = 200;     // 비추 : width 가 class variable 이기 때문
        c1.height = 300;    // 비추 : heigth 가 class variable 이기 때문

        Card.width = 200;   // 정확한 방법
        Card.height = 300;  // 정확한 방법
    }
}

class Card {
    String kind;
    int number;

    static int width = 100;
    static int height = 250;
}