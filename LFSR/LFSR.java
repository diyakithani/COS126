package LFSR;

public class LFSR {
    private String seed;
    private int tap;
    // creates an LFSR with the specified seed and tap
    public LFSR(String seed, int tap){
        this.seed=seed;
        this.tap=tap;
    }

    // returns the number of bits in the LFSR.
    public int length(){
        return seed.length();
    }

    // returns bit i as 0 or 1.
    public int bitAt(int i){
        try{
        return seed.charAt(length()-i);}
        catch(IndexOutOfBoundsException e) {
            System.err.println("Exception ocurred:" + e.getMessage());
            return -1;
        }
    }

    // returns a string representation of this LFSR
    public String toString(){
        return seed;
    }

    // simulates one step of this LFSR and return the new bit as 0 or 1
    public int step(){
        return bitAt(tap)^seed.charAt(0);
        //returns the right
    }

    // simulates k steps of this LFSR and return the k bits as a k-bit integer
    public int generate(int k){
        return k;
    }

    // tests this class by directly calling all instance methods
    public static void main(String[] args) {
    }}
     // creates an LFSR with the specified seed and tap

