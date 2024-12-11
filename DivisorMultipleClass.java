public class DivisorMultipleClass {

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

 
    public static int calculateLCM(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / calculateGCD(a, b);
    }

   
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        
        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b);
        
        System.out.printf("The GCD of %d and %d is: %d\n", a, b, gcd);
        System.out.printf("The LCM of %d and %d is: %d\n", a, b, lcm);
    }
}
