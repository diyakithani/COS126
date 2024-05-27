package assgn3_nbodysimulation;

import lib.stdlib.StdAudio;
import lib.stdlib.StdDraw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NBody {
    public static void main(String[] args) {
        double[] samples = StdAudio.read("assgn3_nbodysimulation/music/2001.wav");
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        double t=0.0;
        StdDraw.setPenRadius(0.03);




        StdDraw.setPenColor(StdDraw.RED);


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
        double[] fx= new double[n];
        double[] fy=new double[n];
        double[] ax=new double[n];
        double[] ay=new double[n];


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
        fscan.close();

        StdDraw.setScale(-rad, rad);
        StdDraw.enableDoubleBuffering();






        while(t<T){


            StdDraw.clear();
            StdDraw.picture(0.5,0.5,"assgn3_nbodysimulation/images/starfield.jpg");
            // Reset forces
            for (int i = 0; i < n; i++) {
                fx[i] = 0;
                fy[i] = 0;
            }
            //calculating force
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                if(i!=j){
                double dx=posx[j]-posx[i];
                double dy=posy[j]-posy[i];
                double d=Math.sqrt(Math.pow(dx,2)+ Math.pow(dy,2));
                double force= 6.6743* Math.pow(10,-11)*mass[i]*mass[j]/Math.pow(d,2); //force of each element on i
                if(d!=0){
                fx[i]=fx[i]+(force*(dx/d));
                fy[i]=fy[i]+(force*(dy/d));}
                }
            }
        }

        //calculating acceleration, velocity and positions
            for(int i=0;i<n;i++){


                StdDraw.picture(posx[i], posy[i],"assgn3_nbodysimulation/images/"+name[i]);
                StdDraw.show();
                ax[i]=fx[i]/mass[i];
                ay[i]=fy[i]/mass[i];
                velx[i] += ax[i] * dt;
                vely[i] += ay[i] * dt;
                posx[i] += velx[i] * dt;
                posy[i] += vely[i] * dt;
                System.out.println("Time: " + t + " Particle " + (i + 1) + " - Position: (" + posx[i] + ", " + posy[i] + ") - Velocity: (" + velx[i] + ", " + vely[i] + ")");
                }

            StdDraw.pause(20);
            t=t+dt;//incrementing the time

        }
            StdDraw.disableDoubleBuffering();


        }catch (FileNotFoundException e) {
                System.err.println("File not found: " + e.getMessage());
    }}}
