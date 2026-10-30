interface ArithmeticReturnDemo {
    public int add(int a, int b);
}

public class LambdaWithAndWithoutReturn {
    public static void main(String[] args) {
        // With return keyword
        ArithmeticReturnDemo arith2 = (a, b) -> {
            return (a + b);
        };

        int sum = arith2.add(10, 20);
        System.out.println("sum of 2 nos " + sum);

        // Without return keyword
        ArithmeticReturnDemo arth = (a, b) -> a + b;

        int sumOfNumbers = arth.add(5, 6);
        System.out.println(sumOfNumbers);
    }
}
