public class Compressed {
	public static String compressed(int[] arr) {
	    String str = "";
	    int currNum = 1;
	    int count = 1;
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] == currNum) {
	            count++;
	        } else {
                str += count + ","; // add counter to result
                count = 1; // reset counter for next
                currNum = 1 - currNum; // changes to next checked value..
                // cases: 
                //      1. currNum = 1 -> 1 - 1 = 0;
                //      2. currNum = 0 -> 1 - 0 = 1 
	        }
	        if (i == arr.length - 1) { // handles last spot.. 
	            str += "" + count;
	        }
	     }
	     return str;
	}
}
