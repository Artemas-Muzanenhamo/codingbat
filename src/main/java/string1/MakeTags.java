package string1;

/**
 * Created by amuzanenhamo on 22/04/2017.
 */
public class MakeTags {
    public static String makeTags(String tag, String word) {

        String html = "";

        if(!tag.isEmpty() && !word.isEmpty()){
            html = "<" + tag + ">" + word + "</" + tag + ">";
        }else{
            html = "<" + tag + ">" + word + "</" + tag + ">";
        }

        return html;
    }
}
