package string2;

class XyzThere {

    boolean xyzThere(String str) {
        if (str.contains(".xyz")) {
            str = str.replace(".xyz", "");
        }
        return str.contains("xyz");
    }

}
