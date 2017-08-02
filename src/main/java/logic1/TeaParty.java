package logic1;

/**
 * Created by artemasm on 28/06/2017.
 */
public class TeaParty {
    public int teaParty(int tea, int candy) {

        if (tea < 5 || candy < 5){
            return 0;
        }

        if (tea >= 5 || candy >= 5){
            if (tea >= candy * 2 || candy >= tea * 2){
                return 2;
            }else {
                return 1;
            }
        }

        return 0;

    }
}
