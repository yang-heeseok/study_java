public class Hello1 {
    public static void main(String[] args) {
        System.err.println("일치");
    }
}  // 소스파일의 이름은 public class 이름과 일치
class hello2 {}
class hello3 {}


/* 
 * 파일 이름과 public 붙은 클래스의 이름이 일치해야 함(대소문자)
 * 파일 1개에는 public class 는 1개만 존재해야 함
 * public 사용하지 않을 경우엔 파일 제목은 어떤 클래스 이름도 된다.
 * main method 가 있는 class 이름을 파일 이름으로 해야 한다.
 */