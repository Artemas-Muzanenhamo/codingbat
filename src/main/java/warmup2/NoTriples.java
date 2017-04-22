package warmup2;

/**
 * Created by amuzanenhamo on 20/04/2017.
 */
public class NoTriples {
    public static boolean noTriples(int[] arr) {

        boolean containsTriple = true;

        int count = 0;

        // if the array length is greater than 3..
        if(arr.length > 3){
            // for each index, check if index and next index are equal
            for (int i = 0; i < arr.length - 1; i++){
                // if indexes are equal...
                if (arr[i] == arr[i + 1]){
                    // add 1 to count
                    count++;
                }
            }

            // if count is greater or equal to 3...
            if(count >= 3){
                // assign false to containsTriple
                containsTriple = false;
            }
        }else if(arr.length == 3){ // otherwise is length is equal to 3 exactly
            // for each index, check if index and next index are equal
            for (int i = 0; i < arr.length - 1; i++){
                // if indexes are equal...
                if (arr[i] == arr[i + 1]){
                    // add 1 to count
                    count++;
                }
            }

            // if count is greater than or equal to 2...
            if(count >= 2){
                // assign false to containsTriple
                containsTriple = false;
            }
        }

        return containsTriple;

    }
}
