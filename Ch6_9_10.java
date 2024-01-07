public class Ch6_9_10 {
    public static void main(String[] args) {
        
        int[] hour = new int[3];
        int[] minute = new int[3];
        int[] second = new int[3];

        // variable type: array vs variable type: class

        class Time {
            int hour;
            int minute;
            int second;
        }
        Time t = new Time();
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        Time [] t4 = new Time[3];
        t4[0] = new Time();
        t4[1] = new Time();
        t4[2] = new Time();

        // 관련 데이터끼리 bind 
        t.hour = 12;
        t.minute = 34;
        t.second = 56;
    }
}


/* 
 * Class
 * 1. 설계도
 * 2. 데이터 + 함수
 * 3. 사용자 정의 데이터 타입 🔥
 * 
 * 밴수 - 배열 - 구조체(C) - 클래스(구조체 + function)
 */ 