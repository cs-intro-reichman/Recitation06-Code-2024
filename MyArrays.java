public class MyArrays {
    public static int[] arr = {6, 7, 1, -56, 93, 10, 30, -3, -23};

    public static void main (String [] args) {
        System.out.println(findDiffBetweenMaxAndMin());
    }

    public static long findDiffBetweenMaxAndMin() {
        long minValue = Integer.MAX_VALUE; // Constant: 2^31 - 1
        long maxValue = Integer.MIN_VALUE; // Constant: -2^31
        for (int i = 0; i < arr.length; i++){
            if (minValue > arr[i]) {
               minValue = arr[i];
            }
            if (maxValue < arr[i]) {
               maxValue = arr[i];
            }
       }
       return maxValue - minValue;			     
   }
}
