package assgn4_RecursiveGraphs;

public class Transform2D {
    // Returns a new array object that is an exact copy of the given array.
    // The given array is not mutated.
    public static double[] copy(double[] array){
        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;

    }

    // Scales the polygon by the factor alpha.
    public static void scale(double[] x, double[] y, double alpha){
        for(int i=0;i<x.length;i++){
            x[i]=x[i]*alpha;
            y[i]=y[i]*alpha;
        }
    }

    // Translates the polygon by (dx, dy).
    public static void translate(double[] x, double[] y, double dx, double dy){
        for(int i=0;i<x.length;i++){
            x[i]=x[i]+dx;
            y[i]=y[i]+dy;
        }
    }

    // Rotates the polygon theta degrees counterclockwise, about the origin.
    public static void rotate(double[] x, double[] y, double theta){
        for(int i=0;i<x.length;i++){
            double oldX = x[i];
            x[i]=x[i]*Math.cos(theta)-(y[i]*Math.sin(theta));
            y[i]=y[i]*Math.cos(theta)+(oldX*Math.sin(theta));
        }
    }

    // Tests each of the API methods by directly calling them.
    public static void main(String[] args){}
}
