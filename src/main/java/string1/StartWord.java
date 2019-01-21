package string1;

/**
 * Created by Artemas on 12/09/2017.
 */
class StartWord {
    String startWord(String string, String word) {

        if (word.length() > string.length()) {
            return "";
        }

        if (string.substring(0, word.length()).equals(word)) {
            return word;
        }

        if (string.substring(1, word.length()).equals(word.substring(1))){
            return string.charAt(0) + word.substring(1);
        }

        return "";
    }
}
