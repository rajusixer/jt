interface HelloSayable {
    public String say();
}

public class LambdaHelloWorld {
    public static void main(String[] args) {
        HelloSayable s = () -> {
            return "hello world";
        };

        System.out.println(s.say());
    }
}
