package warmup2;

/**
 * Created by amuzanenhamo on 03/04/2017.
 */
public class StringX {

    public String stringX(String str){

        String finalWord = null;
        String x = "x";

        if (!str.isEmpty() && str.length() > 1){
            if(str.contains("x")){
                if(str.indexOf('x', 0) == 0){
                    if(str.indexOf('x', str.lastIndexOf('x')) == str.length()-1){
                        str = str.replaceAll("x", "");
                        finalWord = x + str + x;
                    }else{
                        str = str.replaceAll("x", "");
                        finalWord = x + str;
                    }
                }else{
                    finalWord = str.replaceAll("x", "");
                }
            }else{
                finalWord = str;
            }
        }else{
            finalWord = str;
        }

        return finalWord;

    }

}