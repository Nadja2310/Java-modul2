package Day01;

public class Solution {

    public String reverse(String str) {
//        String outputStr = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            outputStr += str.charAt(i);
//        }
//        return outputStr;
//    }
        char[] result = new char[str.length()];
        for (int i = str.length() - 1; i >= 0; i--) {
            result[str.length() - i - 1] = str.charAt(i);
        }
        return new String(result);
    }
    public int nod(int a, int b) {
        if (b==0){
            return a;
        }else {
            return nod(a,a%b);
        }
    }

    public int recurN(int n) {
        if (n == 1) {
            return 1;
        } else
            return recurN(n - 1) + 2 * n - 1;
    }
}

class Test {
    public static void main(String[] args) {
        Solution str = new Solution();
        System.out.println(str.reverse("Error"));
        System.out.println(str.recurN(7));
        System.out.println(str.recurN(1));
        System.out.println(str.recurN(32));
        System.out.println(str.nod(16,96));
    }
}