/**
 * Created by IT_School on 01.11.2015.
 */
public class Exception {
    public static void main(String[] args) {
        int d,a;
        try {
             d = 0;
             a = 42 / d;
            System.out.println("Этот текст никогда не будет напечатан");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
        System.out.println("Уже после блока try-catch");
    }
}
