//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = num1;
        double num3 = num1;

        System.out.println("int값 : " + num1);
        System.out.println("형변환 된 long값 : " + num2);
        System.out.println("형변환 된 double값 : " + num3);

        double num4 = 3.14;
        int num5 = (int) num4;

        System.out.println("double값 : " + num4);
        System.out.println("형변환 된 int 값 : " + num5);
    }
}