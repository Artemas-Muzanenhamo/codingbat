package string1;

/**
 * Created by amuzanenhamo on 05/05/2017.
 */
public class WithoutX {
    public static String withoutX(String str) {

        // if `str` is not empty
        if (!str.isEmpty()){

            String firstChar = str.substring(0, 1);


            //if first index contain x then remove it
            if (firstChar.equals("x")){
                str = str.substring(1);
            }

            /**
             * since we need to get the last char after substringing the first char
             * we assume that the string is of length greater than 0 so
             * we need to check it...
             */
            if (str.length() > 0){
                String lastChar = str.substring(str.length() - 1);

                // if last index contains `x` then remove it
                if (lastChar.equals("x")){
                    str = str.substring(0, str.length() - 1);
                }
            }

            return str;



        }

        return str;
    }
}
