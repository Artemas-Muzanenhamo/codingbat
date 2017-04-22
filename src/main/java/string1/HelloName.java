package string1;

/**
 * Created by amuzanenhamo on 22/04/2017.
 */
public class HelloName {
    public static String helloName(String str) {

        String hello = "Hello";

        if (!str.isEmpty()){
            hello = hello + " " + str;
        }

        return hello+"!";
    }
}
