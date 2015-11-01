package SubStringCons;

/**
 * Created by IT_School on 01.11.2015.
 */
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    void myMethod(){
        System.out.println("Привет");
    }
}
