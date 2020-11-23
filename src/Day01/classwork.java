package Day01;

public class classwork {
    public static void main(String[] args) {
        System.out.println(recurN(7));
        System.out.println(recurN(1));
        System.out.println(recurN(32));
        System.out.println(nod(16,96));
    }

    private static int nod(int a, int b) {
        if (b==0){
            return a;
        }else {
            return nod(a,a%b);
        }
    }

    public static int recurN(int n) {
        if (n == 1) {
            return 1;
        } else
            return recurN(n - 1) + 2 * n - 1;
    }
}
