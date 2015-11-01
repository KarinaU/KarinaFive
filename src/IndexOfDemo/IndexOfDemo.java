package IndexOfDemo;

/**
 * Created by IT_School on 01.11.2015.
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        String s = "Now is the time for all good men " + "to come to the aid of their country.";

        System.out.println(s);
        System.out.println("indexOf(t) = " + s.indexOf('t'));
        System.out.println("lastindexOf(t) = " + s.lastIndexOf('t'));

        System.out.println("Hello".replace('l','w'));
    }
}
