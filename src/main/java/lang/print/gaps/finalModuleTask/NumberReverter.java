package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int result = 0;
        while(number != 0){
            int n = number % 10;
            result = result * 10 + n;
            number /= 10;
        }
        System.out.println(result);
    }
}
