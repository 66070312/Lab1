public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            double[] num = {Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2])};
            double x1 = (-num[1] + Math.pow((Math.pow(num[1], 2) - (4*num[0]*num[2])), 0.5)) / (2*num[0]);
            double x2 = (-num[1] - Math.pow((Math.pow(num[1], 2) - (4*num[0]*num[2])), 0.5)) / (2*num[0]);
            System.out.println(x1);
            System.out.println(x2);
        } catch (NumberFormatException e) {
            System.out.println("Please input data in number format only.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
        }
    }
}
