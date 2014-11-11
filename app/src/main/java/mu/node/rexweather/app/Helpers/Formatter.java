package mu.node.rexweather.app.Helpers;

public class Formatter {

    public static String temperature(float temperature) {
        return String.valueOf(Math.round(temperature)) + "°";
    }
}
