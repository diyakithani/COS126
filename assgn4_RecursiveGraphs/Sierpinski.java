package assgn4_RecursiveGraphs;
import lib.stdlib.StdDraw;

public class Sierpinski {
    //  Height of an equilateral triangle whose sides are of the specified length.
    public static double height(double length){
        double h= length*(Math.sqrt((3)/2));
        return h;
    }

    //  Draws a filled equilateral triangle whose bottom vertex is (x, y)
    //  of the specified side length.
    public static void filledTriangle(double x, double y, double length) {
        double h=height(length);
        double xs[]={x,x+(length/2),x-(length/2)};
        double ys[]={y,y+h,y+h};
        StdDraw.filledPolygon(xs,ys);
    }

    //  Draws a Sierpinski triangle of order n, such that the largest filled
    //  triangle has bottom vertex (x, y) and sides of the specified length.
    public static void sierpinski(int n, double x, double y, double length) {
    }

    //  Takes an integer command-line argument n;
    //  draws the outline of an equilateral triangle (pointed upwards) of length 1;
    //  whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and
    //  draws a Sierpinski triangle of order n that fits snugly inside the outline.
    public static void main(String[] args){
        StdDraw.setCanvasSize(1000, 1000);
        StdDraw.setXscale(-50,50);
        StdDraw.setYscale(-50,50);
        filledTriangle(0,0,15);
}
}
