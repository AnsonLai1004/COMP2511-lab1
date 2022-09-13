package average;

public class Average {
    /**
     * Returns the average of an array of numbers
     * 
     * @param the array of integer numbers
     * @return the average of the numbers
     */
    public static float computeAverage(int[] nums) {
        float result = 0;
        // Add your code
        float sum = 0;
        for (int i : nums) {
            sum += i;
        }
        //System.out.println(sum);

        //System.out.println(nums.length);
        result = sum / nums.length; 
        //System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        // Add your code
        int[] arr = {1, 2, 3, 4, 5, 6};
        //Average ca = new Average();
        //float ca2 = ca.computeAverage(arr);

        System.out.println("The average is " + computeAverage(arr));
    }
}
