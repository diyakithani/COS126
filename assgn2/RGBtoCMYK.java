package assgn2;

public class RGBtoCMYK {
    public static void main(String[] args) {
        double red= Double.parseDouble(args[0]);
        double green= Double.parseDouble(args[1]);
        double blue= Double.parseDouble(args[2]);
        double white= Math.max(red/255, Math.max(green/255,blue/255));
        double black = 1-white;
        if(white!=0){
        double cyan= (white - (red/255))/white;
        double magenta=(white-(green/255))/white;
        double yellow=(white-(blue/255))/white;
        System.out.println("red = " + red);
        System.out.println("green = " + green);
        System.out.println("blue = " + blue);
        System.out.println("cyan = " + cyan);
        System.out.println("magenta = " + magenta);
        System.out.println("yellow = " + yellow);
        System.out.println("black = " + black);
    }
    else{
            System.out.println("red = " + red);
            System.out.println("green = " + green);
            System.out.println("blue = " + blue);
            System.out.println("cyan = 0" );
            System.out.println("magenta = 0" );
            System.out.println("yellow = 0" );
            System.out.println("black = " + black );
    }
    }
}
