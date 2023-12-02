public class f{
    public static void ff (char c , int... p) {
        System.out.println(c + " " + p.length);
        for (int i=0; i<p.length; i++) System.out.println("  " + p[i]);
    }
    public static void main(String[] args) {
        ff('A');
        ff('B', 2, 3);
        ff('C', 5, 7, 9);
    }
}

