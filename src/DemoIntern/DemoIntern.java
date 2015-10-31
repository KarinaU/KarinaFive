package DemoIntern;

/**
 * Created by IT_School on 31.10.2015.
 */
public class DemoIntern {
    public static void main(String[] args) {
        String s1 = "Java"; // ??????? ? ?????? ?? ????
        String s2 = new String("Java");
        System.out.println(s1==s2);
        s2 = s2.intern();
        System.out.println(s1==s2);
    }
}
