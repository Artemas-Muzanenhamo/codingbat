package array1;

/**
 * Created by Artemas on 08/06/2017.
 */
class MaxTriple {
    int maxTriple(int[] nums) {

        int highestValue = 0;

        if (nums.length > 0){
            if (nums.length % 2 != 0){
                if (nums.length < 2){
                    highestValue = nums[0];
                }else{

                    int a = nums[0];
                    int b = nums[((nums.length+1)/2) -1 ];
                    int c = nums[nums.length -1];

                    if (a>b && a>c)
                        highestValue = a;
                    if (b>a && b>c)
                        highestValue = b;
                    if (c>a && c>b)
                        highestValue = c;
                }
            }
        }

        return highestValue;

    }
}
