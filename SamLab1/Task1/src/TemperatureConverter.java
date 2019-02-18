/**
 * Class which converts temperature
 */
public class TemperatureConverter {
    private double temperature;

    /**
     * Constructor of class
     * @param temp Value of temperature that user entered
     */
     TemperatureConverter(double temp){
            this.temperature = temp;
    }

    /**
     * Realization
     * Converts temperature from Celsius to Farenheit degrees
     * @return temperature in Celsius degrees
     */
    private double convertToCelsius(){
        double tempCelsius = (temperature - 32)*5/9;
        return tempCelsius;
    }

    /**
     * Interface of "convertToCelsius()"
     * @return result of covertToCelsius()
     */
    public double getCelsiusTemperature(){
        return convertToCelsius();
    }
}
