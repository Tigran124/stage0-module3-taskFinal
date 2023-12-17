package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String num = String.valueOf(number);
        System.out.println(num.charAt(2) + "" + num.charAt(1) + num.charAt(0));
    }
}
