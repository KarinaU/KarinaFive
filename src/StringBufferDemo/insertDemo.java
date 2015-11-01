package StringBufferDemo;

/**
 * Created by IT_School on 01.11.2015.
 */
public class insertDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I Java!");

        sb.insert(2, "like ");
        System.out.println(sb);
    }
}
