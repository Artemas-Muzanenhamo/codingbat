package warmup2;

/**
 * Created by amuzanenhamo on 15/03/2017.
 */
public class DoubleX {

    public boolean doubleX(String str){

        if (str.isEmpty()){
            return false;
        }else if(str.contains("xx")){

            //get index of the first 'x'
            for (int i=0; i<str.length(); i++){
                if (str.indexOf("x") == str.indexOf("xx")){
                    return true;
                }
                else{
                    return false;
                }
            }
        }

        return false;

    }
}
