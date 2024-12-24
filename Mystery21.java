public class Mystery21 {
    public static int x = 3; // changed
    public static void main (String [] args) {
        int[] y = {1, 2, 3};
        triple1();
        triple2(y); 
        System.out.println(x);
        for (int i = 0; i < x; i++){
            System.out.print(y[i] + " ");
        }
    }
    
    public static void triple1 () { // changed
        x = 3 * x;	                // changed
    }
    
    public static void triple2 (int[] a) {   
        for (int i = 0; i < x; i++){
            a[i] = 3 * a[i];
        }
    }
}
    
