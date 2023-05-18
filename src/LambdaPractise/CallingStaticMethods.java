package LambdaPractise;

interface Convertor{
    long convert(double num);
}
public class CallingStaticMethods {
    public String toString(boolean... values) {
        return values[0] + " " + values[1];
    }

    public static void main(String[] args) {

        Convertor convertor = Math::round;

        long convert = convertor.convert(41.5);
        System.out.println(convert);

        boolean[] b = new boolean[2];
        b[0] = true;

        System.out.println(new CallingStaticMethods().toString(b));
    }

}
