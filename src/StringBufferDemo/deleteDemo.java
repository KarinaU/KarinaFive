package StringBufferDemo;

/**
 * Created by IT_School on 01.11.2015.
 */
public class deleteDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a test.");

        sb.delete(4,7);
        System.out.println("After delete: " + sb);

        sb.deleteCharAt(0);
        System.out.println("After deleteChar: " + sb);
    }
}
