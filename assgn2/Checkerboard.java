package assgn2;

public class Checkerboard {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
