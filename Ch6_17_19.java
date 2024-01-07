public class Ch6_17_19 {
    static int add(int a, int b){
        int res = a+b;
        return res;
    }
    public static void main(String[] args) {
        int result = add(3,5);
        System.out.printf("%d", result);

        System.out.println();
        
        MyMath mxy = new MyMath();
        long res = mxy.add(4,5);
        System.out.printf("%d",res);

        System.out.println();
        System.out.printf("%d",mxy.max(5,2));
        System.out.println();
        System.out.printf("%d",mxy.subtract(5,2));
        System.out.println();
        System.out.printf("%d",mxy.multiply(5,2));
        System.out.println();
        System.out.printf("%f",mxy.divide(5,2));

    }
}


class MyMath {
    long add (long x, long y){
        long result = x+y;
        return result;
    }
    long max (long a, long b){
        long result = 0;
        if (a>=b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }
    long subtract(long a, long b) {return a-b; }
    long multiply(long a, long b) {return a*b; }
    double divide(double a, double b) {return a/b; }
}