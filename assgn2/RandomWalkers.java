package assgn2;

import java.util.Random;
public class RandomWalkers {
    public static void main(String[] args) {
        int n=5;
        int x=0;
        int y=0;
        System.out.println("("+x+","+y+")");
        Random rand= new Random();
        for(int i=1;i<=n;i++){
        int val= 1+ rand.nextInt(100);
        if (val <=25) {
            System.out.println("Go North");
            y=y+1;
            System.out.println("("+x+","+y+")");
        } else if (val <= 50) {
            System.out.println("Go East");
            x=x+1;
            System.out.println("("+x+","+y+")");
        } else if (val <= 75) {
            System.out.println("Go South");
            y=y-1;
            System.out.println("("+x+","+y+")");
        } else {
            System.out.println("Go West");
            x=x-1;
            System.out.println("("+x+","+y+")");
                }
            }
        double dist= Math.sqrt(x*x+y*y);
        System.out.println("Euclidean Distance "+dist);
        }
    }

