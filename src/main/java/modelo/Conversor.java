package modelo;


public class Conversor {
    private Double celsius; 
    private Double fahrenheit; 
    
    public Conversor(){}
    
    public void converterParaFahrenheit(){
        this.fahrenheit = celsius * 1.8 + 32; 
    }

    public Double getCelsius() {
        return celsius;
    }

    public void setCelsius(Double celsius) {
        this.celsius = celsius;
    }

    public Double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(Double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
    
}
