public class DebugTwelve1 {

    public static void main(String[] args) throws ArithmeticException {
        double num = -8.8, result;  // end with ;
        try {
            if (num <= 0)
                throw (new ArithmeticException());
            result = Math.log(num);
            System.out.println("Result is " + result);
        } catch (ArithmeticException e) {   // use ArithmeticException here
            System.out.println("Can't take logarithm for value of zero or lower");
        } catch (NullPointerException e) {

        } catch (RuntimeException e) {

        }
    }
}
