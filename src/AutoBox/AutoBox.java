package AutoBox;

/**
 * Created by IT_School on 31.10.2015.
 */
public class AutoBox {

    static int m (Integer v){
        return v;
    }

    public static void main (String args[]){
        Integer iOb = m(100);

        System.out.println(iOb.MAX_VALUE + 2);
    }
}
