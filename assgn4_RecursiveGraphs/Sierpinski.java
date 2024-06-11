package assgn4_RecursiveGraphs;
import lib.stdlib.StdDraw;

public class Sierpinski {
    //  Height of an equilateral triangle whose sides are of the specified length.
    public static double height(double length){
        double h= length*(Math.sqrt((3))/2);
        return h;
    }
    public static void filledTriangle(double x, double y, double length) {
        double h=height(length);
        double xs[]={x,x+(length/2),x-(length/2)};
        double ys[]={y,y+h,y+h};
        StdDraw.filledPolygon(xs,ys);
    }
    public static void sierpinski(int n, double x, double y, double length) {
        if (n == 0){return;}
        else{
        filledTriangle(x, y, length);
        double h = height(length) ;
        length=length/2;
        // Recursively draw three smaller Sierpinski triangles of order n-1
        sierpinski(n - 1, x, y + h, length); // top triangle
        sierpinski(n - 1, x - length , y, length ); // left triangle
        sierpinski(n - 1, x + length , y, length) ; }// right triangle
        }

    public static void main(String[] args){
        int n=Integer.parseInt(args[0]);
        StdDraw.setCanvasSize(1000, 1000);
        StdDraw.line(0,0,1,0);
        StdDraw.line(0,0,0.5,1);
        StdDraw.line(1,0,0.5,1);
        sierpinski(n,0.5,0,0.5);
}
}
