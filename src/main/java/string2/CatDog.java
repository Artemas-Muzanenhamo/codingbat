package string2;

/**
 * Created by artemasm on 26/07/2017.
 */
public class CatDog {
    public boolean catDog(String str) {
        int len = str.length();
        int cat = 0;
        int dog = 0;

        for (int i = 0; i < len - 2; i++) {
            String temp = str.substring(i, i + 3);
            if (temp.compareTo("cat") == 0)
                cat++;
            if (temp.compareTo("dog") == 0)
                dog++;
        }
        if (cat == dog)
            return true;
        else
            return false;

    }
}
