package assgn1;

public class SumThree {
    public static void main(String[] args) {
        if(args.length==3) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            int sum = a + b + c;
            System.out.println(sum);
        }
        else{
            System.out.println("need three arguments for this program to function");
        }
    }
}
