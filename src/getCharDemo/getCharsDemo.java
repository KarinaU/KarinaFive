package getCharDemo;

/**
 * Created by IT_School on 31.10.2015.
 */
public class getCharsDemo {
    public static void main(String[] args) {
        String s = "This is a demo of get chars method.";
        int start = 10;
        int end = 14;
        char buf[] = new char[end - start];

        s.getChars(start, end, buf, 0);
        System.out.println(buf);
    }
}
