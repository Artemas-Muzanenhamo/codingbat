package string2;

class CountCode {
    // TODO: Incomplete
    int countCode(String str) {
        int count = 0;
        if (str.contains("co")) {
            do {
                count++;
                str = str.replaceFirst("co", "");
            }
            while (str.contains("co"));
        }
        return count;
    }
}
