package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void main(String[] args) {
        calculateSum(1234);
    }
    public static void calculateSum(int number) {
        int first = number % 10;
        number /= 10;
        int second = number % 10;
        number /= 10;
        int third = number % 10;
        number /= 10;
        int fourth = number % 10;
        number /= 10;
        System.out.println(first + second + third + fourth);
    }
}
