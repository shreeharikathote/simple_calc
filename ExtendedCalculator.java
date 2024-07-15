public class ExtendedCalculator extends SimpleCalculator {

    public double square(double a) {
        return a * a;
    }

    public double modulus(double a, double b) {
        return a % b;
    }

    public double cubeRoot(double a) {
        return Math.cbrt(a);
    }

    public static void main(String[] args) {
        ExtendedCalculator calc = new ExtendedCalculator();
        System.out.println("Square: " + calc.square(5));
        System.out.println("Modulus: " + calc.modulus(5, 3));
        System.out.println("Cube Root: " + calc.cubeRoot(27));
    }
}

