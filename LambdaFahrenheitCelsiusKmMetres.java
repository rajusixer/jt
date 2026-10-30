interface TemperatureInterface {
    public void fahrenheitToCelsius(double fahrenheit);
}

interface DistanceInterface {
    public void kilometersToMeters(double kilometers);
}

public class LambdaFahrenheitCelsiusKmMetres {
    public static void main(String[] args) {
        TemperatureInterface temp = (fahrenheit) -> {
            System.out.println((fahrenheit - 32) * (5.0 / 9.0));
        };

        DistanceInterface dist = (kilometers) -> {
            System.out.println(kilometers * 1000);
        };

        temp.fahrenheitToCelsius(97.6);
        dist.kilometersToMeters(6.3);
    }
}
