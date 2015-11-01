package SubStringCons;

/**
 * Created by IT_School on 01.11.2015.
 */
public class MultiCatch {
    public static void main(String[] args) {
        int a;
        try{
            a = args.length;
            int b = 42 / a;
            int[] c = new int [a];
            c[a] = 666;
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль: " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Уже после блока try-catch-catch.");
    }
}
