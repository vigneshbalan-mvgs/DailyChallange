//tree recursion

public class TreeRec {

    public static void main(String[] args) {
        int x = 4;
        name(x);
    }

    public static void name(int x) {
        if (x > 0) {
            System.out.println(x);
        }
        if (x > 0) {
            name(x - 1);
            name(x - 1);
        }
    }
}
