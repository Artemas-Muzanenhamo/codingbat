package warmup2;

/**
 * Created by amuzanenhamo on 12/02/2017.
 */
public class CountXX {

    public static int countXX(String str){

        int num = 0;
        String[] stringArr;
        int count = 0;

        String newString = new String(str);

        if (!newString.isEmpty() && newString.contains("xx")){
            for (int i=0; i <= newString.length(); i++){
                //abcxxx
                if (newString.contains("xx")){
                    count++;
                    num = count;
                    //newString = s.substring(0, pos) + s.substring(pos + 1);
                    newString = newString.substring(0, newString.indexOf("xx")) + newString.substring(newString.indexOf("xx") + 1);
                }
            }

            return num;
        }

        return num;

    }

//    public static String removeCharAt(String s, int pos){
//
//        return s.substring(0, pos) + s.substring(pos + 1);
//    }

}
