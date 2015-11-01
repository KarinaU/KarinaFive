package StringBufferDemo;

/**
 * Created by IT_School on 01.11.2015.
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("buffer = " +sb);
        System.out.println("length = " +sb.length());
        System.out.println("capacity = " +sb.capacity());


        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("buffer after: "+ sb);




    }
}
