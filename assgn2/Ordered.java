package assgn2;

public class Ordered {
    public static boolean ord(int a,int b,int c){
        return (a>=b && b>=c)|| (a<=b && b<=c) ;
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        ord(a,b,c);
    }
}
