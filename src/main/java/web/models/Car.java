package web.models;


public class Car {

    private int series;
    private String model;
    private int year;

    public Car(){}

    public Car(int series, String model, int year) {
        this.series = series;
        this.model = model;
        this.year = year;
    }

    public int getSeries() {
        return series;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public void setSeries(int series) {
        this.series = series;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
