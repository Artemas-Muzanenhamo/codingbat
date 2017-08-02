package logic1;

/**
 * Created by Artemas on 07/07/2017.
 */
public class ShareDigit {
    public boolean shareDigit(int a, int b) {

        int aFirstIndex = a/10;
        int aSecIndex = a%10;

        int bFirstIndex = b/10;
        int bSecIndex = b%10;

        if (aFirstIndex == bFirstIndex || aFirstIndex == bSecIndex || aSecIndex == bFirstIndex || aSecIndex == bSecIndex){
            return true;
        }

        return false;
    }
}
