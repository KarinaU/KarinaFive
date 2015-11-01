package SubStringCons;

/**
 * Created by IT_School on 01.11.2015.
 */
public class ThrowsGenerate {
    static void ThrowOne() throws MyException{
        System.out.println("Внутри ThrowOne");
        throw new MyException("My__Exception");
    }

    public static void main(String[] args) {
        try {
            ThrowOne();
        } catch (MyException e) {
            e.myMethod();
            System.out.println("Выброс: " + e);
        }

    }
    //jhhdgfjidhjlyt
}
