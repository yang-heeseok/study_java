public class Ch6_23 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("Main : x = "+d.x);
    }

    static void change(int x){
        x=1000;
        System.out.println("change() : x = " + x);
    }
}


/* 
 * 기본형 매개변수 : only read
 * 참조형 매개변수 : read, update
 */

class Data {int x;}

/* 
main() : x = 10
change() : x = 1000
After change(d.x)
Main : x = 10
 */