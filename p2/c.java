public class c {
    public static void main (String[] args) {
        int a = 12345, c = 0;
        while (a > 9) {
            c = 0;
            while (a > 0) {
                c += a%10;
                a /= 10;
            }
            a = c;
        }
        System.out.println(a);
    }
}