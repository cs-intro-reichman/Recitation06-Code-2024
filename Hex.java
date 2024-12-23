public class Hex {
    public static void main (String[] args) {
         System.out.println(decToHex(1071)); // output: “42F”  
    }

    public static String decToHex(int num) {
   if (num == 0){
           return "0";
   }
            int cur = num;
            String hexDigits = "0123456789ABCDEF";
            String hex = "";
            while (cur > 0) {
           int remainder = cur % 16;
           hex = hexDigits.charAt(remainder) + hex;
           cur /= 16; 
            }
       return hex;
   }
}
