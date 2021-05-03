package Problem_2;
public class Temperature {
    private double temperature;
    private char scale;
        
    public Temperature(char scale) {
        this.temperature = 0;
        this.scale = scale;
    }

    public Temperature(double temperature) {
        this.temperature = temperature;
        this.scale = 'C';
    }

    public Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public Temperature() {
        this.temperature = 0;
        this.scale = 'C';
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemperatureAndScale(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = scale;
    }

    public double getTemperature() {
        return temperature;
    }

    public char getScale() {
        return scale;
    }

    public double toCelcius() {
        if(scale == 'F')
            temperature = 5 * (getTemperature() - 32) / 9;
        return temperature;
    }

    public double toFahrenheit() {
        if(scale == 'C')
            temperature = 9 * (getTemperature() / 5) + 32;
        return temperature;
    }

    public String toString() {
        return "Temperature = " + getTemperature() + "° " + "Scale = " + getScale();
    }
}