interface ArithmeticAdd {
    public int add(int a, int b);
}

public class LambdaMultipleParametersAddition {
    public static void main(String[] args) {
        ArithmeticAdd arth = (a, b) -> {
            return a + b;
        };

        int sumOfNumbers = arth.add(8, 6);
        System.out.println(sumOfNumbers);
    }
}
