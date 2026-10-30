interface GreetingSayable {
    public String say(String name);
}

public class LambdaSingleParameter {
    public static void main(String[] args) {
        GreetingSayable s = (name) -> {
            return "hello, " + name;
        };

        System.out.println(s.say("World"));
    }
}
