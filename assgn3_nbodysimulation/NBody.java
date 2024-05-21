package assgn3_nbodysimulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class NBody {
    public static void main(String[] args) {
        double T = Double.parseDouble(args[0]);
        double t = Double.parseDouble(args[1]);
        try{
        File inputfile = new File("assgn3_nbodysimulation/planets.txt");
        Scanner fscan = new Scanner(inputfile); //creating a scanner object for the file
        int n = fscan.nextInt();
        double rad = fscan.nextDouble();
        double[] posx = new double[n];
        double[] posy = new double[n];
        double[] velx = new double[n];
        double[] vely = new double[n];
        double[] mass = new double[n];
        String[] name = new String[n];

        for (int i = 0; i < n; i++) {
            posx[i] = fscan.nextDouble();
            posy[i] = fscan.nextDouble();
            velx[i] = fscan.nextDouble();
            vely[i] = fscan.nextDouble();
            mass[i] = fscan.nextDouble();
            name[i] = fscan.next();
        }

        System.out.println("Number of particles: " + n);
        System.out.println("Radius of the universe: " + rad);
        for (int i = 0; i < n; i++) {
            System.out.println("Particle " + (i + 1) + ":");
            System.out.println("Position: (" + posx[i] + ", " + posy[i] + ")");
            System.out.println("Velocity: (" + velx[i] + ", " + vely[i] + ")");
            System.out.println("Mass: " + mass[i]);
            System.out.println("Image Name: " + name[i]);
        }

    } catch (FileNotFoundException e) {
        System.err.println("File not found: " + e.getMessage());
    } catch (NumberFormatException e) {
        System.err.println("Invalid number format: " + e.getMessage());

    }}}
