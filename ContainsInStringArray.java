public class ContainsInStringArray {
	public static boolean containsInArray(String[] arr, String val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(val)){
				return true;
			}
		}
		return false;
	}
}

