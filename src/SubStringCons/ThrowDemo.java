package SubStringCons;

/**
 * Created by IT_School on 01.11.2015.
 */
public class ThrowDemo {
    static  void demoproc(){

        try{
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e){
            System.out.println("Перехвачено внутри demoproc");
            throw  e;
        }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }
        catch (NullPointerException e){
            System.out.println("ПОВТОРНЫЙ перехват: " + e);
        }
    }
}
