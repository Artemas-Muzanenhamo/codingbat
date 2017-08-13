package warmup2;

/**
 * Created by amuzanenhamo on 17/04/2017.
 */
public class Array667 {

    public int array667(int[] arr) {

        // counter
        int count = 0;

        // if empty array, return 0
        if(arr.length > 0){
            // for each index in the array...
            for (int i = 0; i < arr.length - 1; i++) {

                // if array index value is not 6, do nothing...
                if (arr[i] != 6){
                    // do nothing
                }else{
                    // if index 1 == next index in array OR next index == 7
                    if (arr[i] == arr[i + 1] || arr[i + 1] == 7 ){

                        // add 1 to counter
                        count ++;
                    }
                }
            }
        }else{
            return count;
        }

        return count;

    }
}
