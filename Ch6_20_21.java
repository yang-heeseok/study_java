public class Ch6_20_21 {
    public static void main(String[] args) {
        ReturnStudy kuku = new ReturnStudy();
        kuku.printGugudan(3);
    }
}

class ReturnStudy{
    void printGugudan(int dan){
        if (!(2<=dan && dan<=9)) {
            return;
        }
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d*%d=%d%n", dan,i,dan*i);
            System.out.println();
        }
    }
}