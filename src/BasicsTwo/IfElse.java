package basics.src.BasicsTwo;

public class IfElse {
    public static void main(String[] args) {
        int a = 2, b = 4, c = 3;
    // iç içe ifler de yazılabilir.
        if ( (a < b ) && ( a < c )) {

            System.out.println("A en küçük sayıdır");
        }else if (( b < a ) && ( b < c)) {
            System.out.println("B en küçük sayıdır");
        }
    }

}
