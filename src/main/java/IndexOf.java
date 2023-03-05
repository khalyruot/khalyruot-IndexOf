
//

public class IndexOf {
    /**
     * Find the position of a number in an array.
     * For example, the position of 7 in {0,1,7,3,4} is 2.
     *
     * @param arr an int array.
     * @param n a possible value of arr.
     * @return the first index (position) of n in arr. if n does not exist in arr, return -1.
     */
    public int getIndex(int[] arr, int n){
        int a = 0;
        int i = 0;
        int b = 0;

        while(i<arr.length){
            a = arr[i];
            if (n == a){
                b = i;
                break;

            }
            else{
                b = -1;
            }
            i++;

        }
    
        return b;
    }
}
