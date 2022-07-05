package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int result = 0;
        while(number != 0){
            int n = number % 10;
            result += n;
            number /= 10;
        }
        System.out.println(result);
    }
}
