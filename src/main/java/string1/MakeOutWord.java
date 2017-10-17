package string1;

/**
 * Created by amuzanenhamo on 22/04/2017.
 */
public class MakeOutWord {
    public String makeOutWord(String out, String word) {

        String madeWord = "";

        if(!out.isEmpty()){

            madeWord = out.substring(0, out.length() / 2) + word + out.substring(out.length() / 2 , out.length());

        }else{
            madeWord = out + word;
        }

        return madeWord;

    }
}
