public class StdLibMain {
    public static void main(String[] args) {
        In in = new In("./data.txt");       
        while (!in.isEmpty()){
            StdOut.println(in.readInt());	
        }
    }
    
}
